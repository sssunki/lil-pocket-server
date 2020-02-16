package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.DateTestBean;
import com.example.lilpocket.Bean.UploadFileResponse;
import com.example.lilpocket.Service.FileService;
import com.example.lilpocket.Service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private volatile String accounts;
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @Autowired
    private FileService fileService;

    @PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(@RequestParam("files") MultipartFile file) {
        String fileName = fileService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile")
                .path(fileName)
                .toUriString();

        return new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(
            @PathVariable String fileName,
            HttpServletRequest request) {
        Resource resource = fileService.loadFileAsResource(fileName);

        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(
                    resource.getFile().getAbsolutePath()
            );
        } catch (IOException e) {
            logger.info("Could not ");
        }

        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" +
                        resource.getFilename() + "\"")
                .body(resource);
    }

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/date/add")
    public int addDateTestBean(@RequestBody DateTestBean dateTestBean) {
        try {
            dateTestBean.setDateTest(Timestamp.valueOf(dateTestBean.getDateTestSend()));
        }catch (Exception e) {
            e.printStackTrace();
        };
        System.out.println(dateTestBean.getDateTest());
        return testService.addDateTestBean(dateTestBean);
    }


    @PostMapping("/date/get")
    public DateTestBean getDateTestBeanByCode(@RequestBody int dateCode) {
        return testService.getDateTestBeanByCode(dateCode);
    }


    private class StringChange{
        String afterChange;

        public String getAfterChange() {
            return afterChange;
        }

        public void setAfterChange(String afterChange) {
            this.afterChange = afterChange;
        }
    }


    @PostMapping
    public List<String> doubleRequestBodyTest(@RequestBody String account) {
        List<String> testList = new LinkedList<>();
        String a = "parent";
        StringChange change = new StringChange();
        change.setAfterChange(account);
        System.out.println(account);
        testList.add(a);
        testList.add(change.getAfterChange());
        testList.add("good");
        System.out.println(testList);
        System.out.println(account.equals("ssski"));
        return testList;
    }

}
