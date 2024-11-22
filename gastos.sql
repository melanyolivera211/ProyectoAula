-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2024 a las 04:09:25
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gastos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gastos`
--

CREATE TABLE `gastos` (
  `Id` int(11) NOT NULL,
  `Cedula` int(11) NOT NULL,
  `NroSerie` varchar(30) NOT NULL,
  `Electrodomestico` varchar(30) NOT NULL,
  `Gasto` double NOT NULL,
  `HorasUso` double NOT NULL,
  `Fecha` date NOT NULL,
  `GastoMes` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `gastos`
--

INSERT INTO `gastos` (`Id`, `Cedula`, `NroSerie`, `Electrodomestico`, `Gasto`, `HorasUso`, `Fecha`, `GastoMes`) VALUES
(125, 1234, 'Prueba', 'Documental', 12, 1, '2023-12-12', 12),
(129, 12, 'prue', 'asd', 12, 12, '1111-11-12', 144),
(123, 1234, 'Si', 'No', 123, 11, '2024-11-12', 1353),
(130, 123, 'asd', 'asd', 123, 312, '2001-12-12', 38376),
(126, 1234, 'Denuevo', 'sad', 213, 12, '2121-12-12', 2556),
(127, 123, 'Denuevo', 'denuevo', 213, 12, '2121-12-13', 2556);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `gastos`
--
ALTER TABLE `gastos`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `gastos`
--
ALTER TABLE `gastos`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=131;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
