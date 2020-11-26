create database oficina;

use oficina;

create table clientes (
    cpf varchar(11) primary key,
    nome varchar(50) not null,
    idade int not null,
    rg varchar(7) not null,
    telefone varchar(11) not null
);

create table carros (
    placa varchar(7) primary key,
    anomodelo int not null,
    marca varchar(50) not null,
    modelo varchar(50) not null,
    anofabricacao int not null,
	cpf_cliente varchar(11) not null,
    
    foreign key (cpf_cliente) references clientes (cpf)
);