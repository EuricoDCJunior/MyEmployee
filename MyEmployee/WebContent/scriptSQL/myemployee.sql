-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18-Nov-2017 às 19:03
-- Versão do servidor: 5.7.11
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myemployee`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `benefits`
--

CREATE TABLE `benefits` (
  `Codigo` int(11) NOT NULL,
  `Descricao` varchar(50) NOT NULL,
  `Valor` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cargo`
--

CREATE TABLE `cargo` (
  `Codigo` int(11) NOT NULL,
  `Descricao` varchar(50) NOT NULL,
  `Status` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cargo`
--

INSERT INTO `cargo` (`Codigo`, `Descricao`, `Status`) VALUES
(1, 'Domestica', 'Ativo'),
(2, 'Jardineiro', 'Ativo'),
(3, 'Cozinheiro', 'Ativo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contract_agreement`
--

CREATE TABLE `contract_agreement` (
  `Codigo` int(11) NOT NULL,
  `EmpregadorId` int(11) NOT NULL,
  `EmpregadoId` int(11) NOT NULL,
  `CargoId` int(11) NOT NULL,
  `Salario` double NOT NULL,
  `DataInicio` date NOT NULL,
  `DataFinal` date NOT NULL,
  `CargaHoraria` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `contract_agreement`
--

INSERT INTO `contract_agreement` (`Codigo`, `EmpregadorId`, `EmpregadoId`, `CargoId`, `Salario`, `DataInicio`, `DataFinal`, `CargaHoraria`) VALUES
(1, 1, 4, 3, 1500, '2017-11-18', '2018-11-18', 192),
(2, 1, 3, 1, 1600, '2016-12-31', '2017-12-31', 192),
(3, 2, 2, 2, 1200, '2015-11-18', '2018-11-18', 192),
(4, 3, 1, 2, 1200, '2017-11-18', '2018-11-18', 192);

-- --------------------------------------------------------

--
-- Estrutura da tabela `employee`
--

CREATE TABLE `employee` (
  `Codigo` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `DataNasc` date NOT NULL,
  `Cpf` varchar(16) NOT NULL,
  `Rg` varchar(16) NOT NULL,
  `TelefoneFixo` varchar(12) NOT NULL,
  `TelefoneCelular` varchar(13) NOT NULL,
  `Cep` varchar(13) NOT NULL,
  `Rua` varchar(50) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Bairro` varchar(50) NOT NULL,
  `Cidade` varchar(50) NOT NULL,
  `Uf` varchar(3) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Status` varchar(5) NOT NULL,
  `Sexo` varchar(9) NOT NULL,
  `Complemento` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `employee`
--

INSERT INTO `employee` (`Codigo`, `Nome`, `DataNasc`, `Cpf`, `Rg`, `TelefoneFixo`, `TelefoneCelular`, `Cep`, `Rua`, `Numero`, `Bairro`, `Cidade`, `Uf`, `Email`, `Status`, `Sexo`, `Complemento`) VALUES
(1, 'Luan Fernando Marques', '1996-06-14', '144.274.348-43', '47.995.111-1', '41-3456-3434', '41-99445-3423', '86010-140', 'Alemeda Manuel Ribas', 203, 'Centro', 'Londrina', 'PR', 'luan123@live.com', 'Ativo', 'Masculino', 'Casa'),
(2, 'Joana Lima Duarte', '1989-12-23', '295.418.208-32', '39.256.657-6', '44-3466-6434', '44-99335-3333', '86010-220', 'Alemeda Manuel Chicolino', 2321, 'Centro', 'Cascavel', 'PR', 'joaninha@yahoo.com', 'Ativo', 'Feminino', 'Apartamento'),
(3, 'Mariela Gomes Lian', '1998-03-12', '254.313.675-44', '38.726.600-8', '41-3336-1414', '41-98945-3423', '86010-990', 'Alemeda Manuel Ribas', 1232, 'Centro', 'Curitiba', 'PR', 'mariela@outlook.com', 'Ativo', 'Feminino', 'Casa'),
(4, 'Maria Luiza Freitas', '1989-11-23', '434.453.554-52', '43.943.851-2', '41-3226-3004', '41-99145-1413', '84410-220', 'Almeida Custodia Limar', 909, 'Vila verde', 'Curitiba', 'PR', 'marialuiza@outlook.com', 'Ativo', 'Feminino', 'Apartamento');

-- --------------------------------------------------------

--
-- Estrutura da tabela `employee_taxes`
--

CREATE TABLE `employee_taxes` (
  `Codigo` int(11) NOT NULL,
  `Descricao` varchar(50) NOT NULL,
  `Valor` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `employer`
--

CREATE TABLE `employer` (
  `Codigo` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `DataNasc` date NOT NULL,
  `Cpf` varchar(16) NOT NULL,
  `Cnpj` varchar(21) NOT NULL,
  `TelefoneFixo` varchar(12) NOT NULL,
  `TelefoneCelular` varchar(13) NOT NULL,
  `Cep` varchar(10) NOT NULL,
  `Rua` varchar(50) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Bairro` varchar(50) NOT NULL,
  `Cidade` varchar(50) NOT NULL,
  `Uf` varchar(3) NOT NULL,
  `Status` varchar(5) NOT NULL,
  `Sexo` varchar(9) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `employer`
--

INSERT INTO `employer` (`Codigo`, `Nome`, `DataNasc`, `Cpf`, `Cnpj`, `TelefoneFixo`, `TelefoneCelular`, `Cep`, `Rua`, `Numero`, `Bairro`, `Cidade`, `Uf`, `Status`, `Sexo`) VALUES
(1, 'Maria Luiza Souza Marques', '1970-11-08', '656.316.838-81', '59.473.585/0001-00', '41-3666-6434', '41-98845-3423', '86660-340', 'General Manuel Oliveira Cunha ', 908, 'Vila Nova', 'Maringa', 'PR', 'Ativo', 'Feminino'),
(2, 'Joao Donizete Marques', '1968-04-12', '572.645.688-22', '04.731.910/0001-03', '48-3776-3771', '48-96645-6413', '36010-887', 'Chileno Alvorada Gomes', 342, 'Central City', 'Mato Grosso do Sul', 'RS', 'Ativo', 'Masculino'),
(3, 'Daiane Souza Marques', '1995-05-28', '091.701.388-34', '10.353.805/0001-72', '67-3433-3311', '67-98855-1123', '82310-140', 'General Rui Malagueta ', 712, 'Ecoville', 'Campo Grande', 'MS', 'Ativo', 'Feminino');

-- --------------------------------------------------------

--
-- Estrutura da tabela `holerite`
--

CREATE TABLE `holerite` (
  `Codigo` int(11) NOT NULL,
  `EmpregadorId` int(11) NOT NULL,
  `EmpregadoId` int(11) NOT NULL,
  `SalarioBase` double NOT NULL,
  `Desconto` double NOT NULL,
  `Irrf` double NOT NULL,
  `Inss` double NOT NULL,
  `Transporte` double NOT NULL,
  `DataGerar` date NOT NULL,
  `TotalLiquido` double NOT NULL,
  `Status` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE `user` (
  `Codigo` int(11) NOT NULL,
  `Tipo` varchar(11) NOT NULL,
  `Usuario` varchar(50) NOT NULL,
  `Senha` varchar(50) NOT NULL,
  `Status` varchar(5) NOT NULL,
  `ContaEmpregador` int(11) NOT NULL,
  `ContaEmpregado` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `user`
--

INSERT INTO `user` (`Codigo`, `Tipo`, `Usuario`, `Senha`, `Status`, `ContaEmpregador`, `ContaEmpregado`) VALUES
(1, 'Empregador', 'MARIA.LUIZA', 'maria1234', 'Ativo', 1, 0),
(2, 'Empregado', 'LUAN.FERNANDO', 'hard@123', 'Ativo', 0, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `benefits`
--
ALTER TABLE `benefits`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indexes for table `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indexes for table `contract_agreement`
--
ALTER TABLE `contract_agreement`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indexes for table `employee_taxes`
--
ALTER TABLE `employee_taxes`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indexes for table `employer`
--
ALTER TABLE `employer`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indexes for table `holerite`
--
ALTER TABLE `holerite`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `benefits`
--
ALTER TABLE `benefits`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `cargo`
--
ALTER TABLE `cargo`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `contract_agreement`
--
ALTER TABLE `contract_agreement`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `employee_taxes`
--
ALTER TABLE `employee_taxes`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `employer`
--
ALTER TABLE `employer`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `holerite`
--
ALTER TABLE `holerite`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
