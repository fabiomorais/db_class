--SET DATEFORMAT YMD

Insert Into Hospedes Values ('159874256911', 'Maria dos Santos', 'Av. Epitácio Pessoa, 21, João Pessoa', 'F', '1960-02-06')
Insert Into Hospedes Values ('547221658922', 'João Augusto Trindade', 'R. das Flores, 33, Recife', 'M', '1980-05-14')
Insert Into Hospedes Values ('522655488922', 'Ana Maria Pereira', 'R. Augusta, 51, São Paulo', 'F', '1972-08-09')
Insert Into Hospedes Values ('922411035844', 'Luiza Costa', 'Av. Epitácio Pessoa, 297, João Pessoa', 'F', '1985-12-24')
Insert Into Hospedes Values ('241699512000', 'Francisco Chaves dos Santos', 'R. Aurora, 95, Maceió', 'M', '1955-09-06')
Insert Into Hospedes Values ('621000385221', 'Antônio Alves', 'R. José Firmino, 33, Rio de Janeiro', 'M', '1980-05-09')
Insert Into Hospedes (cpf, nome, endereco, sexo) Values ('453982210087', 'Marieta Gonçalves', 'R. Luiz Paiva, 90, Curitiba', 'F')

--select * from Hospedes

Insert Into Quartos Values (220, 'Standard', 150.60)
Insert Into Quartos Values (230, 'Suíte Master', 500)
Insert Into Quartos Values (240, 'Luxo Superior', 320)
Insert Into Quartos Values (250, 'Suíte Presidencial', 850)
Insert Into Quartos Values (320, 'Standard', 150.60)
Insert Into Quartos Values (330, 'Luxo Superior', 320)
Insert Into Quartos Values (340, 'Suíte Master', 500)

--select * from Quartos

Insert Into Estadias Values ('159874256911', 220, '2011-12-14', '2011-12-24')
Insert Into Estadias Values ('547221658922', 230, '2011-01-01', '2011-01-10')
Insert Into Estadias Values ('522655488922', 340, '2011-08-09', '2011-08-20')
Insert Into Estadias Values ('159874256911', 330, '2011-02-05', '2011-02-09')
Insert Into Estadias Values ('922411035844', 250, '2011-07-05', '2011-07-22')
Insert Into Estadias Values ('241699512000', 220, '2011-05-21', '2011-05-25')
Insert Into Estadias Values ('621000385221', 330, '2012-03-03', '2012-03-09')
Insert Into Estadias Values ('621000385221', 340, '2012-09-01', '2012-09-04')
Insert Into Estadias Values ('547221658922', 330, '2012-06-20', '2012-06-30')
Insert Into Estadias Values ('922411035844', 250, '2012-10-10', '2012-10-15')
Insert Into Estadias Values ('922411035844', 330, '2012-03-12', '2012-03-15')
Insert Into Estadias Values ('547221658922', 340, '2012-10-04', '2012-10-08')
Insert Into Estadias Values ('547221658922', 340, '2012-01-04', '2012-01-08')
Insert Into Estadias Values ('621000385221', 330, '2012-01-12', '2012-01-15')
Insert Into Estadias Values ('241699512000', 250, '2012-02-20', '2012-02-22')
Insert Into Estadias Values ('547221658922', 330, '2012-04-20', '2012-04-23')
Insert Into Estadias Values ('621000385221', 250, '2012-06-12', '2012-06-15')
Insert Into Estadias Values ('241699512000', 220, '2012-08-20', '2012-08-24')
Insert Into Estadias Values ('621000385221', 340, '2012-09-01', '2012-09-04')



--select * from Estadias

Insert Into Servicos Values (1, 'Lavanderia', 45)
Insert Into Servicos Values (2, 'Passadeira', 25.50)
Insert Into Servicos Values (3, 'Babá', 230)
Insert Into Servicos Values (4, 'Café no Quarto', 34.50)
Insert Into Servicos Values (5, 'Lanchonete', 50)

--select * from Servicos

Insert Into Solicitacoes Values ('159874256911', 1, '2011-12-15', '09:30:00')
Insert Into Solicitacoes Values ('547221658922', 5, '2011-01-09', '22:15:20')
Insert Into Solicitacoes Values ('621000385221', 3, '2011-09-03', '13:00:00')
Insert Into Solicitacoes Values ('922411035844', 1, '2012-10-12', '20:06:52')
Insert Into Solicitacoes Values ('922411035844', 4, '2012-07-10', '11:32:41')
Insert Into Solicitacoes Values ('922411035844', 4, '2012-03-14', '15:22:00')
Insert Into Solicitacoes Values ('547221658922', 1, '2012-10-05', '07:11:41')
Insert Into Solicitacoes Values ('547221658922', 5, '2012-01-05', '10:20:00')
Insert Into Solicitacoes Values ('241699512000', 1, '2012-02-21', '19:55:22')
Insert Into Solicitacoes Values ('547221658922', 3, '2012-04-22', '19:06:52')
Insert Into Solicitacoes Values ('241699512000', 4, '2012-08-21', '09:43:55')
Insert Into Solicitacoes Values ('621000385221', 5, '2012-09-03', '17:09:00')

--select * from Solicitacoes



