-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:4306
-- Tiempo de generación: 16-05-2023 a las 07:51:21
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
-- Base de datos: `groovemusic`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

CREATE TABLE `admin` (
  `ID` int(11) NOT NULL,
  `NomAdmin` varchar(30) NOT NULL,
  `PassAdmin` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `admin`
--

INSERT INTO `admin` (`ID`, `NomAdmin`, `PassAdmin`) VALUES
(1, 'blaster', '12345'),
(2, 'adminp', 'prueb');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `IDArticulo` int(11) NOT NULL,
  `Nombre` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Descri` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Precio` float NOT NULL,
  `Marca` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `NoExistencias` int(11) NOT NULL,
  `IMG` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`IDArticulo`, `Nombre`, `Descri`, `Precio`, `Marca`, `NoExistencias`, `IMG`) VALUES
(1, 'Guitarra', 'Guitarra Electrica', 5000, 'Gibson', 20, ''),
(2, 'Bajo', 'Bajo Electrico', 3000, 'Taylor', 20, ''),
(3, 'Bateria', 'Bateria 5 piezas', 15000, 'Gibson', 60, 'https://www.mercadazo.com.mx/121721-large_default/bateria-musical-acustica-5-piezas-22-tambor-baquetas.jpg'),
(4, 'Microfono', 'Microfono para audio', 1200, 'MetalF', 70, 'https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcTm9oNg-1xBGz84hrTsmJsOJrOKKh0mo8bxK5O4oftaBUKBNuTTg6tWB1SAMJO0YyjKiLu1iOk35Yj5KGna55agOpma3Sgi-7i0EVxCqFyWzsMM_2dKUDJXGw&usqp=CAE'),
(6, 'Amplificador de Sonido', 'Amplifica el audio', 35000, 'Hudson', 30, 'https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcQwlrvZ7UzjSC1YaMhJulqnZeTEtO-KbQHG0VY7vy5WWT7FwxLLDoAE5S9ZitpkEiol_NuJmefJ3bdXIWNAoRlHt-Ig4S_UXjoS1AdFXW8N6pBP83jGcnWL&usqp=CAE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `artxprov`
--

CREATE TABLE `artxprov` (
  `IDArt` int(11) NOT NULL,
  `IDProv` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `artxprov`
--

INSERT INTO `artxprov` (`IDArt`, `IDProv`) VALUES
(2, 1),
(3, 5),
(4, 1),
(1, 6),
(6, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `IDCliente` int(11) NOT NULL,
  `NombreCli` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ApellidosCli` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `NomUsu` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `RFC` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `CorreoEle` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `NoCompras` int(11) DEFAULT 0,
  `ClienteFrec` varchar(5) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`IDCliente`, `NombreCli`, `ApellidosCli`, `NomUsu`, `RFC`, `CorreoEle`, `Password`, `NoCompras`, `ClienteFrec`) VALUES
(1, 'Daniel', 'Flores', 'djfg', 'DJFG65465YU5', 'prueba@hotmail.com', '54321', 5, 'Si'),
(2, 'Uriel', 'Montejano', 'BlasterSun', 'BS56748FD1', 'blaster@upslp.com', '987654', 0, 'No'),
(3, 'prueba', 'prueba', 'pru', 'PRU8347324', 'prueba@hotmail.com', 'prupass', 0, 'No'),
(4, 'Timmy', 'Perez', 'timoteo', 'TPC345465TR4', 'timmi@upslp.com', 'timmipassword', 1, 'No'),
(5, 'Pablo', 'Salazar', 'pablito', 'PSR458712EW9', 'pablo@upslp.com', 'pablopass', 0, 'No'),
(6, 'Pepe', 'Hernandez', 'pepu', 'PHP23121ER6', 'pep@hotmail.com', 'pepass', 9, 'Si'),
(7, 'Gilberto', 'Agundez', 'techy', 'TMA64897HG5', 'techy@hotmail.com', 'techypass', 0, 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clixart`
--

CREATE TABLE `clixart` (
  `IDCliente` int(11) NOT NULL,
  `IDArticulo` int(11) NOT NULL,
  `Cantidad` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clixart`
--

INSERT INTO `clixart` (`IDCliente`, `IDArticulo`, `Cantidad`) VALUES
(5, 2, 1),
(5, 1, 2),
(5, 2, 1),
(5, 3, 3),
(5, 2, 1),
(5, 1, 3),
(3, 2, 1),
(3, 1, 8),
(3, 3, 1),
(1, 1, 1),
(1, 3, 2),
(1, 2, 5),
(1, 3, 1),
(1, 2, 1),
(1, 2, 1),
(3, 3, 3),
(5, 3, 2),
(5, 1, 1),
(5, 2, 5),
(5, 2, 4),
(5, 1, 1),
(5, 3, 3),
(5, 2, 1),
(5, 1, 13),
(5, 3, 2),
(1, 4, 5),
(1, 1, 1),
(1, 4, 2),
(1, 1, 1),
(3, 4, 1),
(3, 2, 4),
(3, 4, 1),
(3, 2, 4),
(4, 4, 4),
(4, 1, 1),
(4, 2, 3),
(4, 4, 2),
(4, 2, 1),
(4, 3, 3),
(6, 6, 2),
(6, 1, 1),
(6, 2, 2),
(6, 1, 2),
(6, 4, 5),
(6, 6, 1),
(6, 6, 1),
(6, 4, 3),
(6, 1, 2),
(6, 4, 3),
(6, 1, 2),
(6, 6, 1),
(1, 4, 2),
(1, 1, 1),
(6, 3, 2),
(6, 1, 1),
(6, 3, 1),
(6, 1, 2),
(6, 3, 1),
(6, 1, 2),
(6, 4, 4),
(6, 3, 3),
(6, 1, 1),
(6, 4, 5),
(1, 6, 2),
(1, 4, 3),
(4, 6, 2),
(4, 4, 4),
(4, 1, 1),
(1, 4, 1),
(1, 1, 2),
(6, 4, 2),
(6, 1, 1),
(1, 2, 2),
(1, 1, 1),
(1, 4, 5),
(1, 4, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Pais` varchar(50) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `CorreoElectronico` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`ID`, `Nombre`, `Pais`, `Telefono`, `CorreoElectronico`) VALUES
(1, 'Gibson', 'Estados Unidos', '58741269', 'gibson@hotmail.com'),
(5, 'RadioShack', 'México', '4896874590', 'radioshack@gmail.com'),
(6, 'MetalF', 'Rusia', '1236874597', 'metal@gmail.com'),
(7, 'MusicC', 'India', '2458976210', 'musicc@hotmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursales`
--

CREATE TABLE `sucursales` (
  `IDSucursal` int(11) NOT NULL,
  `PaisSuc` varchar(30) NOT NULL,
  `EstadoSuc` varchar(30) NOT NULL,
  `TelefonoSuc` varchar(30) NOT NULL,
  `CodigoPostal` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sucursales`
--

INSERT INTO `sucursales` (`IDSucursal`, `PaisSuc`, `EstadoSuc`, `TelefonoSuc`, `CodigoPostal`) VALUES
(6, 'Mexico', 'Monterrey', '48962514', '59874'),
(7, 'Estados Unidos', 'Washington', '36547892', '26547');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `IDVendedor` int(11) NOT NULL,
  `NomVen` varchar(30) NOT NULL,
  `ApVen` varchar(30) NOT NULL,
  `CorreoEleVen` varchar(30) NOT NULL,
  `TelVen` varchar(30) NOT NULL,
  `NoVentas` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`IDVendedor`, `NomVen`, `ApVen`, `CorreoEleVen`, `TelVen`, `NoVentas`) VALUES
(1, 'Pedro', 'Sanchez', 'pedro@hotmail.com', '4932178216', 0),
(2, 'Santiago', 'Martinez', 'santi@outlook.com', '2587413610', 20),
(3, 'Emanuel', 'Hernandez', 'ema@hotmail.com', '8745698574', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venxsuc`
--

CREATE TABLE `venxsuc` (
  `IDSucursal` int(11) NOT NULL,
  `IDVendedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venxsuc`
--

INSERT INTO `venxsuc` (`IDSucursal`, `IDVendedor`) VALUES
(6, 1),
(7, 1),
(6, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`IDArticulo`);

--
-- Indices de la tabla `artxprov`
--
ALTER TABLE `artxprov`
  ADD KEY `IDArt` (`IDArt`),
  ADD KEY `IDProv` (`IDProv`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`IDCliente`);

--
-- Indices de la tabla `clixart`
--
ALTER TABLE `clixart`
  ADD KEY `IDCliente` (`IDCliente`),
  ADD KEY `IDArticulo` (`IDArticulo`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD PRIMARY KEY (`IDSucursal`);

--
-- Indices de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`IDVendedor`);

--
-- Indices de la tabla `venxsuc`
--
ALTER TABLE `venxsuc`
  ADD KEY `IDSucursal` (`IDSucursal`),
  ADD KEY `IDVendedor` (`IDVendedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `admin`
--
ALTER TABLE `admin`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `articulos`
--
ALTER TABLE `articulos`
  MODIFY `IDArticulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `IDCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  MODIFY `IDSucursal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  MODIFY `IDVendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `artxprov`
--
ALTER TABLE `artxprov`
  ADD CONSTRAINT `artxprov_ibfk_1` FOREIGN KEY (`IDArt`) REFERENCES `articulos` (`IDArticulo`),
  ADD CONSTRAINT `artxprov_ibfk_2` FOREIGN KEY (`IDProv`) REFERENCES `proveedores` (`ID`);

--
-- Filtros para la tabla `clixart`
--
ALTER TABLE `clixart`
  ADD CONSTRAINT `clixart_ibfk_1` FOREIGN KEY (`IDCliente`) REFERENCES `clientes` (`IDCliente`),
  ADD CONSTRAINT `clixart_ibfk_2` FOREIGN KEY (`IDArticulo`) REFERENCES `articulos` (`IDArticulo`);

--
-- Filtros para la tabla `venxsuc`
--
ALTER TABLE `venxsuc`
  ADD CONSTRAINT `venxsuc_ibfk_1` FOREIGN KEY (`IDSucursal`) REFERENCES `sucursales` (`IDSucursal`),
  ADD CONSTRAINT `venxsuc_ibfk_2` FOREIGN KEY (`IDVendedor`) REFERENCES `vendedores` (`IDVendedor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
