create table filmes.Pessoa(
	NOME_ARTISTICO varchar(31) primary key,
	NOME_VERDADEIRO varchar(31),
	SEXO varchar(11),
	ANO_DE_NASCIMETNO int,
	ANO_DE_CARREIRA int);

create table filmes.Jurado(
	ID_JURADO int primary key,
	NOME_JURADO varchar(31));

create table filmes.Artista(
	ID_ARTISTA int primary key, 
	NOME_ARTISTA varchar(31));

create table filmes.Juri(
	ID_JURADO INT,
	ID_EDICAO int);

create table filmes.Edicao(
	ID_EDICAO int primary key,
	NOME_EDICAO varchar(31),
	LOCALIZACAO varchar(31),
	DADA_DO_EVENTO varchar(11),
	TIPO varchar(11),
	ANO_DE_INICIO int,
	NACIONALIDADE varchar(11));

create table filmes.Premiacoes(
	ID_PREMIACOES int primary key,
	ID_PREMIO int,
	ID_EDICAO int);

create table filmes.Premio(
	ID_PREMIO int primary key,
	NOME_PROPRIO varchar(31),
	CATEGORIA varchar(11),
	FILME_OU_ARTISTA varchar(11));

create table filmes.MelhorDirecao(ID_PREMIO int);

create table filmes.MelhorFilme(ID_PREMIO int);

create table filmes.MelhorAtrizPrincipal(ID_PREMIO int);

create table filmes.MelhorAtrizCoadjuvante(ID_PREMIO int);

create table filmes.MelhorAtorPrincipal(ID_PREMIO int);

create table filmes.MelhorAtorCoadjuvante(ID_PREMIO int);

create table filmes.FilmesIndicados(
	ID_FILME int,
	ID_EDICAO int);

create table filmes.ArtistaIndicado(
	ID_EDICAO int,
	CATEGORIA varchar(31),
	ID_ARTISTA int);

create table filmes.Filmes(
	ID_FILME int primary key,
	TITULO varchar(31),
	IDIOMA_ORIGINAL  varchar(11),
	ANO_DE_PRODUCAO int,
	NACIONALIDADE varchar(11),
	TITULO_EM_PORTUGUES varchar(31),
	TIPO_FILME varchar(11));

create table filmes.Estreiando(
	ID_ESTREIA int,
	ID_FILME int);

create table filmes.Estreia(
	ID_ESTREIA int primary key,
	LOCALIZACAO varchar(31),
	ARRECADACAO_PRIMEIRO_ANO float(2),
	SALA_EXIBICAO int);

create table filmes.Dirigiram(
	ID_FILME int,
	PRINCIPAL varchar(4),
	ID_DIRETOR int);

create table filmes.Diretor(
	ID_DIRETOR int primary key,
	ID_ARTISTA int);

create table filmes.Producao(
	ID_FILME int,
	ID_PRODUTOR int);

create table filmes.Produtor(
	ID_PRODUTOR int primary key,
	ID_ARTISTA int);

create table filmes.Roteiro(
	ID_FILME int,
	ID_ROTEIRISTA int);

create table filmes.Roteirista(
	ID_ROTEIRISTA int primary key,
	ID_ARTISTA int);

create table filmes.Atuacao(
	ID_FILME int,
	TIPO_ATUACAO varchar(11),
	ID_ATOR int);

create table filmes.Ator(
	ID_ATOR int primary key,
	ID_ARTISTA int);

alter table Jurado
add constraint NOME_JURADO 
foreign key (NOME_JURADO)
references filmes.Pessoa(NOME_ARTISTICO);

alter table artista 
add constraint NOME_ARTISTA 
foreign key (NOME_ARTISTA)
references Pessoa(NOME_ARTISTICO);

alter table Juri 
add constraint ID_JURADO
foreign key (ID_JURADO)
references jurado(ID_JURADO);

alter table Juri 
add constraint ID_EDICAO
foreign key (ID_EDICAO)
references Edicao(ID_EDICAO);

alter table Premiacoes  
add constraint ID_EDICAO
foreign key (ID_EDICAO)
references Edicao(ID_EDICAO);

alter table Premiacoes  
add constraint ID_PREMIO
foreign key (ID_PREMIO)
references PREMIO(ID_PREMIO);

alter table MelhorDirecao
add constraint ID_PREMIO 
foreign key (ID_PREMIO)
references filmes.Premio(ID_PREMIO);

alter table MelhorFilme
add constraint ID_PREMIO 
foreign key (ID_PREMIO)
references filmes.Premio(ID_PREMIO);

alter table MelhorAtrizPrincipal
add constraint ID_PREMIO 
foreign key (ID_PREMIO)
references filmes.Premio(ID_PREMIO);

alter table MelhorAtrizCoadjuvante
add constraint ID_PREMIO 
foreign key (ID_PREMIO)
references filmes.Premio(ID_PREMIO);

alter table MelhorAtorPrincipal
add constraint ID_PREMIO 
foreign key (ID_PREMIO)
references filmes.Premio(ID_PREMIO);

alter table MelhorAtorCoadjuvante
add constraint ID_PREMIO 
foreign key (ID_PREMIO)
references filmes.Premio(ID_PREMIO);

alter table FilmesIndicados
add constraint ID_EDICAO
foreign key (ID_EDICAO)
references filmes.Edicao(ID_EDICAO);

alter table FilmesIndicados 
add constraint ID_FILME
foreign key (ID_FILME)
references filmes.Filmes(ID_FILME);

alter table ArtistaIndicado
add constraint ID_EDICAO
foreign key (ID_EDICAO)
references filmes.Edicao(ID_EDICAO);

alter table ArtistaIndicado
add constraint ID_ARTISTA
foreign key (ID_ARTISTA)
references filmes.Artista(ID_ARTISTA);

alter table Estreiando
add constraint ID_FILME
foreign key (ID_FILME)
references filmes.Filmes(ID_FILME)

alter table Estreiando
add constraint ID_ESTREIA
foreign key (ID_ESTREIA)
references filmes.Estreia(ID_ESTREIA)

alter table Dirigiram
add constraint ID_FILME
foreign key (ID_FILME)
references filmes.Filmes(ID_FILME)

alter table Dirigiram
add constraint ID_DIRETOR
foreign key (ID_DIRETOR)
references filmes.Diretor(ID_DIRETOR)

alter table Diretor
add constraint ID_ARTISTA
foreign key (ID_ARTISTA)
references filmes.Artista(ID_ARTISTA)

alter table Producao
add constraint ID_FILME
foreign key (ID_FILME)
references filmes.Filmes(ID_FILME)

alter table Producao
add constraint ID_PRODUTOR
foreign key (ID_PRODUTOR)
references filmes.Produtor(ID_PRODUTOR)

alter table Produtor
add constraint ID_ARTISTA
foreign key (ID_ARTISTA)
references filmes.Artista(ID_ARTISTA)

alter table Roteiro
add constraint ID_FILME
foreign key (ID_FILME)
references filmes.Filmes(ID_FILME)

alter table Roteiro 
add constraint ID_ROTEIRISTA
foreign key (ID_ROTEIRISTA)
references filmes.Roteirista(ID_ROTEIRISTA)

alter table Roteirista
add constraint ID_ARTISTA
foreign key (ID_ARTISTA)
references filmes.Artista(ID_ARTISTA)

alter table Atuacao
add constraint ID_FILME
foreign key (ID_FILME)
references filmes.Filmes(ID_FILME)

alter table Atuacao
add constraint ID_ATOR
foreign key (ID_ATOR)
references filmes.Ator(ID_ATOR)

alter table Ator
add constraint ID_ARTISTA
foreign key (ID_ARTISTA)
references filmes.Artista(ID_ARTISTA)

