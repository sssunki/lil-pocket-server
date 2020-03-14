-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- 主机： mysql
-- 生成日期： 2020-03-14 14:09:37
-- 服务器版本： 8.0.17
-- PHP 版本： 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `lil_pocket_user`
--

-- --------------------------------------------------------

--
-- 表的结构 `connected_user`
--

CREATE TABLE `connected_user` (
  `parentAccount` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `childAccount` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `parentName` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `childName` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `connected_user`
--

INSERT INTO `connected_user` (`parentAccount`, `childAccount`, `parentName`, `childName`) VALUES
('ssski', 'sonski', 'ssskis', 'ssskison'),
('skiii', 'sonski', 'ssskis', 'ssskison'),
('skisii', 'sonski', 'ssskis', 'ssskison');

-- --------------------------------------------------------

--
-- 表的结构 `date_test`
--

CREATE TABLE `date_test` (
  `dateTest` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `dateCode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `date_test`
--

INSERT INTO `date_test` (`dateTest`, `dateCode`) VALUES
('2020-01-15 13:27:32', 1000);

-- --------------------------------------------------------

--
-- 表的结构 `memory_summary_table`
--

CREATE TABLE `memory_summary_table` (
  `sendAccount` varchar(40) NOT NULL,
  `receiveAccount` varchar(40) NOT NULL,
  `title` varchar(40) NOT NULL,
  `memoryId` varchar(40) NOT NULL,
  `memoryTimestamp` timestamp NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- 表的结构 `memory_table`
--

CREATE TABLE `memory_table` (
  `sendAccount` varchar(40) NOT NULL,
  `receiveAccount` varchar(40) NOT NULL,
  `memoryTimestamp` timestamp NOT NULL,
  `fileCount` int(11) NOT NULL,
  `content` varchar(800) NOT NULL,
  `title` varchar(40) NOT NULL,
  `memoryId` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- 表的结构 `note_table`
--

CREATE TABLE `note_table` (
  `sendAccount` varchar(40) NOT NULL,
  `receiveAccount` varchar(40) NOT NULL,
  `noteContent` varchar(400) NOT NULL,
  `noteTimestamp` timestamp NOT NULL,
  `sendTimestamp` timestamp NOT NULL,
  `cycle` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- 表的结构 `user_test`
--

CREATE TABLE `user_test` (
  `uid` int(20) NOT NULL,
  `user_name` varchar(40) DEFAULT NULL,
  `identify` varchar(40) DEFAULT NULL,
  `account` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 转存表中的数据 `user_test`
--

INSERT INTO `user_test` (`uid`, `user_name`, `identify`, `account`, `password`) VALUES
(1, '1', '1', '1', '1'),
(1, '1', '1', '1', '1'),
(2, NULL, '1', '1', '1'),
(3, '1', '1', '1', '1'),
(3, '1', '1', 'ski', 'P@ssw0rd'),
(3, '1', '1', 'ssski', 'P@ssw0rd'),
(5, 'ssski', 'parent', 'sssunki', 'pAssword'),
(11, 'ssski', 'parent', 'skiii', 'pAssword'),
(12, 'ssski', 'parent', 'skisii', 'pAssword');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
