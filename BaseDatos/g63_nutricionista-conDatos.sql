-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 05:51:19
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `g63.nutricionista`
--
CREATE DATABASE IF NOT EXISTS `g63.nutricionista` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `g63.nutricionista`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `nombre` varchar(75) NOT NULL,
  `detalle` varchar(75) DEFAULT NULL,
  `calorias` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`nombre`, `detalle`, `calorias`, `idComida`, `estado`) VALUES
('Arroz al Vapor', 'Arroz al vapor', 400, 1, 1),
('Arroz Hervido', 'Arroz Hervido', 350, 2, 2),
('Pollo', 'Pollo hervido', 555, 3, 2),
('Fideos', 'Fideos varios', 350, 4, 2),
('Tostadas', 'Tostadas con queso crema/miel/mermelada', 200, 5, 2),
('Milanesa', 'Milanesa pollo/carne/cerdo', 666, 6, 2),
('Papa Fritas', 'Papas a la francesa', 920, 7, 2),
('Papas Hervidas', 'Papas hervidas con/sin condimentos', 550, 8, 1),
('Pure de Papa', 'Pure de papa', 550, 9, 2),
('Ensalada', 'Hojas verdes finamente cortadas\npuede contener zanahoria, semillas varias', 69, 10, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `nombre` varchar(75) NOT NULL,
  `idPaciente` int(11) DEFAULT NULL,
  `pesoInicial` float NOT NULL,
  `pesoObjetivo` float NOT NULL,
  `fechaInicial` date NOT NULL,
  `fechaFinal` date NOT NULL,
  `idDieta` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`nombre`, `idPaciente`, `pesoInicial`, `pesoObjetivo`, `fechaInicial`, `fechaFinal`, `idDieta`, `estado`) VALUES
('New dieta 01', 1, 51, 101, '2023-10-01', '2023-10-26', 7, 2),
('New dieta 02', 2, 52, 102, '2023-10-01', '2023-11-30', 8, 2),
('New dieta 03', 3, 53, 43, '2023-10-01', '2023-11-30', 9, 2),
('New dieta 04', 4, 54, 54.4, '2023-10-01', '2023-10-25', 10, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietacomida`
--

CREATE TABLE `dietacomida` (
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `horario` varchar(50) NOT NULL,
  `porcion` varchar(50) NOT NULL,
  `idDC` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dietacomida`
--

INSERT INTO `dietacomida` (`idComida`, `idDieta`, `horario`, `porcion`, `idDC`, `estado`) VALUES
(3, 7, 'CENA', 'MEDIANA', 1, 2),
(7, 7, 'SNACK', 'PEQUEÑA', 2, 2),
(6, 7, 'ALMUERZO', 'GRANDE', 3, 2),
(2, 8, 'DESAYUNO', 'PEQUEÑA', 4, 2),
(3, 8, 'DESAYUNO', 'PEQUEÑA', 5, 2),
(4, 8, 'DESAYUNO', 'PEQUEÑA', 6, 2),
(5, 8, 'DESAYUNO', 'PEQUEÑA', 7, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `dni` int(11) NOT NULL,
  `apellido` varchar(75) NOT NULL,
  `nombre` varchar(75) NOT NULL,
  `pesoActual` float NOT NULL,
  `altura` float NOT NULL,
  `edad` int(11) NOT NULL,
  `genero` varchar(1) NOT NULL,
  `domicilio` varchar(75) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `idPaciente` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`dni`, `apellido`, `nombre`, `pesoActual`, `altura`, `edad`, `genero`, `domicilio`, `telefono`, `email`, `idPaciente`, `estado`) VALUES
(3331, 'PacTest01', 'Paciente01', 51, 51, 33, 'M', 'paciente01 0000', '123456789', 'paciente01@gmail.com', 1, 2),
(3332, 'PacTest02', 'Paciente02', 52, 52, 33, 'F', 'paciente02 0000', '123456789', 'paciente02@gmail.com', 2, 2),
(3333, 'PacTest03', 'Paciente03', 53, 53, 33, 'M', 'paciente03 0000', '123456789', 'paciente03@gmail.com', 3, 2),
(3334, 'PacTest04', 'Paciente04', 54, 54, 33, 'F', 'paciente04 0000', '123456789', 'paciente04@gmail.com', 4, 2),
(3335, 'PacTest05', 'Paciente05', 65, 55, 33, 'M', 'paciente05 0000', '123456789', 'paciente05@gmail.com', 5, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `idDieta` int(11) DEFAULT NULL,
  `idPaciente` int(11) NOT NULL,
  `peso` float NOT NULL,
  `fecha` date NOT NULL,
  `idVisita` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`idDieta`, `idPaciente`, `peso`, `fecha`, `idVisita`, `estado`) VALUES
(7, 1, 51, '2023-10-01', 7, 2),
(8, 2, 52, '2023-10-01', 8, 2),
(9, 3, 53, '2023-10-01', 9, 2),
(10, 4, 54, '2023-10-01', 10, 2),
(NULL, 5, 55, '2023-10-28', 11, 2),
(NULL, 5, 55.5, '2023-10-29', 12, 2),
(NULL, 5, 56, '2023-10-30', 13, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`idComida`),
  ADD UNIQUE KEY `nombre_2` (`nombre`,`calorias`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD PRIMARY KEY (`idDC`),
  ADD KEY `idDieta` (`idDieta`),
  ADD KEY `idComida` (`idComida`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `idPaciente` (`idPaciente`),
  ADD KEY `idDieta` (`idDieta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD CONSTRAINT `dietacomida_ibfk_1` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`),
  ADD CONSTRAINT `dietacomida_ibfk_2` FOREIGN KEY (`idComida`) REFERENCES `comida` (`idComida`);

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`),
  ADD CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
