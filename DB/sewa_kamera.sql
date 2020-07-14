-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 14, 2020 at 01:10 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sewa_kamera`
--

-- --------------------------------------------------------

--
-- Table structure for table `aksesoris`
--

CREATE TABLE `aksesoris` (
  `kd_aksesoris` varchar(6) NOT NULL,
  `nama_aksesoris` varchar(100) NOT NULL,
  `jenis_aksesoris` varchar(25) NOT NULL,
  `harga_aksesoris` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aksesoris`
--

INSERT INTO `aksesoris` (`kd_aksesoris`, `nama_aksesoris`, `jenis_aksesoris`, `harga_aksesoris`) VALUES
('AK001', 'Weifeng Stainless 3110', 'TRIPOD', 15000),
('AK002', 'Fotopro Tripod Flexsible ', 'TRIPOD', 20000),
('AK003', 'Velbon Tripod CX-888', 'TRIPOD', 20000),
('AK004', 'FILTER UV', 'FILTER', 25000),
('AK005', 'FILTER ND Standard', 'FILTER', 20000),
('AK006', 'FILTER GND 1', 'FILTER', 20000),
('AK007', 'FILTER GND 2', 'FILTER', 20000);

-- --------------------------------------------------------

--
-- Table structure for table `kamera`
--

CREATE TABLE `kamera` (
  `kd_kamera` varchar(5) NOT NULL,
  `nama_kamera` varchar(100) NOT NULL,
  `jenis_kamera` varchar(20) NOT NULL,
  `harga_kamera` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kamera`
--

INSERT INTO `kamera` (`kd_kamera`, `nama_kamera`, `jenis_kamera`, `harga_kamera`) VALUES
('KM001', 'CANON EOS 3000D', 'DSLR', 35000),
('KM002', 'CANON EOS 1500D', 'DSLR', 35000),
('KM003', 'CANON EOS 200D', 'DSLR', 40000),
('KM004', 'NIKON D3300', 'DSLR', 35000),
('KM005', 'NIKON D3400', 'DSLR', 35000),
('KM006', 'NIKON D5500', 'DSLR', 40000),
('KM007', 'GoPro HERO6 Black', 'ACTION CAM', 50000),
('KM008', 'YI 4K+ ', 'ACTION CAM', 50000),
('KM009', 'Sony FDR-X3000R', 'ACTION CAM', 50000),
('KM010', 'Sony Alpha 5000', 'MIRRORLESS', 45000),
('KM011', 'Pentax Q-51', 'MIRRORLESS', 45000);

-- --------------------------------------------------------

--
-- Table structure for table `lensa`
--

CREATE TABLE `lensa` (
  `kd_lensa` varchar(6) NOT NULL,
  `nama_lensa` varchar(100) NOT NULL,
  `jenis_lensa` varchar(20) NOT NULL,
  `harga_lensa` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lensa`
--

INSERT INTO `lensa` (`kd_lensa`, `nama_lensa`, `jenis_lensa`, `harga_lensa`) VALUES
('LS001', 'Nikon AF-S 70-200mm ', 'Lensa Tele', 50000),
('LS002', 'Canon EF 70-200mm ', 'Lensa Tele', 45000),
('LS003', 'Pentax 100mm f/2.8 ', 'Lensa Macro', 70000),
('LS004', 'Canon EF 85mm', 'Lensa Fixed', 25000),
('LS005', 'AF-S NIKKOR 35mm', 'Lensa Fixed', 25000),
('LS006', 'Fujinon XF16mm', 'Lensa Wide ', 30000),
('LS007', ' Canon EF-S 24mm', 'Lensa Wide ', 25000),
('LS008', 'Lumix G 8mm', 'Lensa Fisheye', 40000),
('LS009', 'Canon Kit', 'Lensa Kit', 20000),
('LS010', 'Nikon kit Lens', 'Lensa Kit', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(5) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(0, 'user', 'user123'),
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_kamera`
--

CREATE TABLE `transaksi_kamera` (
  `no_transaksi` varchar(10) NOT NULL,
  `id_pelanggan` varchar(10) NOT NULL,
  `kd_kamera` varchar(6) NOT NULL,
  `nama_kamera` varchar(20) NOT NULL,
  `harga_kamera` varchar(20) NOT NULL,
  `jmlsw_kamera` int(10) NOT NULL,
  `lamasw_kamera` int(10) NOT NULL,
  `kd_lensa` varchar(6) NOT NULL,
  `nama_lensa` varchar(25) NOT NULL,
  `harga_lensa` int(10) NOT NULL,
  `jmlsw_lensa` int(10) NOT NULL,
  `lamasw_lensa` int(10) NOT NULL,
  `kd_aksesoris` varchar(6) NOT NULL,
  `nama_aksesoris` varchar(25) NOT NULL,
  `harga_aksesoris` int(10) NOT NULL,
  `jmlsw_akse` int(10) NOT NULL,
  `lamasw_akse` int(10) NOT NULL,
  `total` int(10) NOT NULL,
  `bayar` int(10) NOT NULL,
  `kembali` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi_kamera`
--

INSERT INTO `transaksi_kamera` (`no_transaksi`, `id_pelanggan`, `kd_kamera`, `nama_kamera`, `harga_kamera`, `jmlsw_kamera`, `lamasw_kamera`, `kd_lensa`, `nama_lensa`, `harga_lensa`, `jmlsw_lensa`, `lamasw_lensa`, `kd_aksesoris`, `nama_aksesoris`, `harga_aksesoris`, `jmlsw_akse`, `lamasw_akse`, `total`, `bayar`, `kembali`) VALUES
('TS001', 'PLG001', 'KM001', 'CANON EOS 3000D', '35000', 1, 1, 'LS008', 'Lumix G 8mm', 40000, 1, 1, 'AK001', 'Weifeng Stainless 3110', 15000, 1, 1, 90000, 100000, 10000),
('TS002', 'PLG002', 'KM004', 'NIKON D3300', '35000', 1, 2, 'LS005', 'AF-S NIKKOR 35mm', 25000, 0, 0, 'AK002', 'Fotopro Tripod Flexsible ', 20000, 1, 1, 90000, 100000, 10000),
('TS003', 'PLG003', 'KM006', 'NIKON D5500', '40000', 1, 1, 'LS005', 'AF-S NIKKOR 35mm', 25000, 1, 1, 'AK001', 'Weifeng Stainless 3110', 15000, 1, 1, 80000, 100000, 20000),
('TS004', 'PLG004', 'KM006', 'NIKON D5500', '40000', 1, 1, 'LS006', 'Fujinon XF16mm', 30000, 1, 1, 'AK004', 'FILTER UV', 25000, 1, 1, 95000, 100000, 5000),
('TS005', 'PLG005', 'KM004', 'NIKON D3300', '35000', 1, 1, 'LS003', 'Pentax 100mm f/2.8 ', 70000, 1, 1, 'AK003', 'Velbon Tripod CX-888', 20000, 2, 1, 145000, 150000, 5000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aksesoris`
--
ALTER TABLE `aksesoris`
  ADD PRIMARY KEY (`kd_aksesoris`);

--
-- Indexes for table `kamera`
--
ALTER TABLE `kamera`
  ADD PRIMARY KEY (`kd_kamera`);

--
-- Indexes for table `lensa`
--
ALTER TABLE `lensa`
  ADD PRIMARY KEY (`kd_lensa`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi_kamera`
--
ALTER TABLE `transaksi_kamera`
  ADD PRIMARY KEY (`no_transaksi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
