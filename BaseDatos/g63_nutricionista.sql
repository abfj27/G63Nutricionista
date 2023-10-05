-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-10-2023 a las 23:12:37
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
('Pollo', 'Pollo al horno', 300, 28, 1),
('Arroz', 'Arroz al vapor', 245, 29, 1),
('Huevo', 'Huevo frito', 50, 30, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `nombre` varchar(75) NOT NULL,
  `idPaciente` int(11) NOT NULL,
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
('Subir peso paciente007', 28, 60, 80, '2023-10-05', '2023-10-05', 22, 1),
('Subir peso paciente008', 29, 66.6, 88.8, '2023-10-05', '2023-10-05', 23, 1),
('Bajar peso paciente009', 30, 120, 90, '2023-10-05', '2023-10-05', 24, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietacomida`
--

CREATE TABLE `dietacomida` (
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `horario` varchar(50) NOT NULL,
  `idDC` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dietacomida`
--

INSERT INTO `dietacomida` (`idComida`, `idDieta`, `horario`, `idDC`, `estado`) VALUES
(28, 22, 'ALMUERZO', 19, 1),
(29, 23, 'ALMUERZO', 20, 1),
(30, 22, 'DESAYUNO', 21, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `dni` int(11) NOT NULL,
  `apellido` varchar(75) NOT NULL,
  `nombre` varchar(75) NOT NULL,
  `pesoActual` float NOT NULL,
  `domicilio` varchar(75) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `idPaciente` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`dni`, `apellido`, `nombre`, `pesoActual`, `domicilio`, `telefono`, `email`, `idPaciente`, `estado`) VALUES
(1231, 'Bavastro', 'Alesio', 60, 'Avenida Siempre Viva', '+54 1231', 'asd@hotmail.com', 28, 1),
(1232, 'Kaminski', 'Nicolas', 75, 'Avenida Siempre Viva 69', '+54 1232', 'asd@hotmail.com.nico', 29, 1),
(1233, 'Perez', 'Maria', 80, 'Avenida Siempre Viva', '+54 1233', 'asd@hotmail.com', 30, 0);

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
(22, 28, 60, '2023-10-05', 22, 1),
(22, 28, 61.5, '2023-10-05', 23, 1),
(22, 28, 62, '2023-10-05', 24, 0);

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
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

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
