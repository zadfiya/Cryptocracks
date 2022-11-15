-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2022 at 03:02 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crypto_currency`
--

--
-- Dumping data for table `bookmarks`
--

INSERT INTO `bookmarks` (`id`, `coinid`, `quantity`, `purchasedPrice`, `purchasedDate`, `insertDate`, `updateDate`, `name`) VALUES
(1, 1, 5, 5000, '2022-02-20', '2022-11-14', '2022-11-14', 'Bitcoin'),
(2, 1, 10, 5460, '2022-02-25', '2022-11-14', '2022-11-14', 'Bitcoin'),
(3, 4, 25, 85, '2021-02-10', '2022-11-14', '2022-11-14', 'Tether'),
(4, 26, 45, 2, '2022-02-17', '2022-11-14', '2022-11-14', 'GeoCoin'),
(5, 33, 16, 74, '2021-01-10', '2022-11-14', '2022-11-14', 'UniCoin');

--
-- Dumping data for table `coins`
--

INSERT INTO `coins` (`id`, `price`, `volume24`, `startDate`, `icon`, `name`) VALUES
(1, 16445.17, 9.04418890398944e18, '2010-07-17', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/4caf2b16a0174e26a3482cea69c34cba.png', 'Bitcoin'),
(2, 0.341, 3146993050.9, '2013-11-25', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/ba90bcb0cafb4801ac5dd310f47d6411.png', 'Ripple'),
(3, 1.0446, 25379.26, '2013-11-29', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/806538b8257e4a34b5ca749546a74512.png', 'Namecoin'),
(4, 0.9986, 1.330586410484242e21, '2013-12-27', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/5ed65416963e4e57998a3c302da8936e.png', 'Tether'),
(5, 1.027, 32372.57, '2014-02-11', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/81dfc73a2b2c43f88d4eb628d10fdafb.png', 'Blakecoin'),
(6, 0.0844, 3973644952.54, '2014-02-21', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/63e240f3047f41c791796784bc719f63.png', 'DogeCoin'),
(7, 1.0446, 0, '2011-04-27', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/c16f5692239842d091c6e503878f327a.png', 'Leone'),
(8, 0.0051, 53.46, '2014-04-20', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/70cbf2b20fb64b93bc88452968b55a95.png', 'Feathercoin'),
(9, 0.3969, 4657.894, '2014-04-20', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/efa68c178a554d54b51fafaef310a14b.png', 'Peercoin'),
(10, 0.0171, 29562.85, '2014-04-20', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/a32d373b31124173ae5739f7bcd7eca3.png', 'Terracoin'),
(11, 0.00000341, 36.06, '2017-04-27', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/a4abf16e9b174047bec05232e8313575.png', 'El Salvador Colon'),
(12, 0.0000084, 0, '2014-07-28', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/bde625d6229342ccb4b09e08356a3878.png', 'ORO'),
(13, 1.0005, 34519.74, '2014-07-30', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/ebd3726585004a99926148fbc0689529.png', 'Torcoin'),
(14, 0.08652, 825229.47, '2014-09-04', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/18410e750ee849b387ed3f55d6dcc9a8.png', 'StarCoin'),
(15, 0.00749, 406868.71, '2014-09-27', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/d2c0f3ffcebc4476baea030357d0a68d.png', 'BitShares'),
(16, 0.00259, 1779554.96, '2014-09-28', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/777e9aacba2c4284a4c7abeaf87b8256.png', 'Nxt'),
(17, 1.027, 0, '2014-07-18', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/d92dc187ac364209af31dcda0422b130.png', 'StrikeBitClub'),
(18, 0.000000001844, 0, '2014-02-21', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/ff7412d0d8be4574bd7200121938aa5c.png', 'Darkcoin'),
(19, 32.7949, 21667230624.13, '2017-03-14', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/f32f9586011f4358825c71a0f1a2981d.png', 'UCoin'),
(20, 0.1883, 80011808.82, '2014-12-11', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/e2742ef9cce2458d89d9d19152746997.png', 'Brazilian Real'),
(21, 0.001092, 0, '2014-12-12', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/76c27e1e8b0c46059e678aece1c7f771.png', 'Chilean Peso'),
(22, 0.01097, 911878.4, '2015-01-04', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/1a2d1cdc337243ad828b5291b2823107.png', 'PayCon'),
(23, 0.0428, 47.01, '2015-01-06', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/2a77f4579267472a92255c4d2e6cc9ad.png', 'NAVCoin'),
(24, 0.00000112, 0, '2015-01-19', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/5efb5b0441424886a683d449310340b4.png', 'MCC'),
(25, 1.3446, 0, '2015-01-30', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/0c5a5f1697204e9280ea7d6325634475.png', 'RICE'),
(26, 0.02129, 13.48, '2015-01-31', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/d36c1cd0d4d2438fb780bc2966fdaa7f.png', 'GeoCoin'),
(27, 0.00000009844, 0, '2015-02-11', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/1a676ecb8136459aa03a4d7df20202a5.png', 'BitSend'),
(28, 0.0002346, 76278.39, '2015-02-16', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/20ad35decb324dd39b62fdd78059ee5d.png', 'TopCoin'),
(29, 0.00153, 1014053.83, '2015-02-20', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/b311861cb258493982df963c33e31950.png', 'RedCoin'),
(30, 0.0000353, 3.17, '2015-03-16', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/bf66be9c520f40e9ab1b6f1a0a61255d.png', 'Guncoin'),
(31, 0.12987, 0.12987, '2015-03-17', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/dc9cf9cc5cb448b19c067b004e6af45e.png', 'Titcoin'),
(32, 0.14656, 25604.55, '2015-03-19', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/abfd8c9b6e5f40319b3d74594679bfea.png', 'MCL'),
(33, 5.068, 272141.01, '2015-04-11', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/7c0ec11703c9476aaf59f3d196539ad5.png', 'UniCoin'),
(34, 0.00485, 1.31, '2015-04-24', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/23d814be39174081bd6ba17fa401481f.png', 'LUXCoin'),
(35, 0.0016257, 108.81, '2015-04-25', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/b003a11e5e7b4a3bbd93d63f3de31dfa.png', 'Boliviano'),
(36, 0.00509, 0, '2020-01-01', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/5eed3aee73a8472dbb405cb451c25029.png', 'RM'),
(37, 0.027755, 6228.89, '2020-01-06', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/31330265be264eae83b8f26bcb18aced.png', 'GLEEC'),
(38, 10.0839, 966718.2, '2018-12-09', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/a7882309ce99416e911f218b2398fbee.png', 'ATO'),
(39, 0.83984, 3325.52, '2018-12-10', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/13794ecbf9af4b63a38b0f34faac3a16.png', 'PLTC'),
(40, 14.5199, 301782.28, '2020-12-04', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/d415e12155814c598e04c53f9bf1b092.png', 'COVER'),
(41, 1.039, 128255.88, '2020-12-04', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/51d9843869c0458aa453cd992e43cb19.png', 'ORAI'),
(42, 2.45157, 14165983.56, '2020-12-05', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/63c1a26506d943ab8447178576607307.png', 'BADGER'),
(43, 0.6106, 380001.57, '2020-12-09', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/841dca36b5ef452ea94edcab8253f4d6.png', 'SYN'),
(44, 84.537, 0, '2020-12-09', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/7c2b11a6a65a48ba9a9a5a19ebd34f13.png', 'ABNB'),
(45, 0.006065, 103.85, '2020-12-10', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/3f29f6e258764e3d9d358f416ff7de0f.png', 'PPAY'),
(46, 3.2836, 0, '2020-12-09', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/31330265be264eae83b8f26bcb18aced.png', 'GLXY'),
(47, 8324.89, 0.37148, '2020-12-12', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/b71be431d067403f938622474df06921.png', 'SKL3S'),
(48, 3.0492, 2324449.34, '2020-12-14', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/b7bb1eeb35bb4256b326664040eca8fa.png', 'JUV'),
(49, 5.85, 1248.27, '2020-12-15', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/fa9726c33e8f4185a49df7174492fccf.png', 'GZIL'),
(50, 60796.77, 0, '2020-12-16', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/6e62ba15bb5c43c5b7f1e85f4f937536.png', 'APHA'),
(51, 1.19051, 349583.03, '2020-12-16', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/cc5c5970a7774a2982bacc555ac63c5c.png', 'ACB'),
(52, 0.00257, 33223.22, '2020-12-17', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/86bad72bc95b4d7db591a512ff1a07a2.png', 'PANDO'),
(53, 0.0010917, 26851.76, '2020-12-18', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/097a87050f2344dd93fd2b6999d0a999.png', 'DFL'),
(54, 0.0445, 19.11, '2014-04-20', 'https://s3.eu-central-1.amazonaws.com/bbxt-static-icons/type-id/png_512/a7462768a4ba40e9b1ca73120b8bf7b4.png', 'Novacoin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
