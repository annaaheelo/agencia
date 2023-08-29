package br.com.senai;


import java.time.LocalDate;


import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Endereco;
import br.com.senai.models.Escolaridade;

public class App 
{
    
    public static void main( String[] args ){
   
        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI;

        Candidato yasmin = new Candidato();
        yasmin.nomeCompleto = "Yasmin Carvalho da Silva";
        yasmin.dataNascimento = LocalDate.of(2000, 10, 16);
        yasmin.email = "yasmincarvalho@gmail.com";
        yasmin.genero = Genero.F;
        yasmin.naturalidade = Estado.PI.toString();
        yasmin.nacionalidade = "Brasil";
        yasmin.endereco = endereco;

         Candidato a = new Candidato();
        a.nomeCompleto = "a";
        a.dataNascimento = LocalDate.of(2008, 07, 26);

       Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Sistema para Internet";
       e1.nomeInstituição = "Senai";
        e1.dataInicio = LocalDate.of(2020, 10, 01 );
        e1.dataFim = LocalDate.of(2023, 06, 10);

        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Engenharia Civil";
       e2.nomeInstituição = "IFPI - Inst. Federal do Piauí";
        e2.dataInicio = LocalDate.of(2020, 02, 01);
        e2.dataFim = LocalDate.of(2023, 06, 10);

        //List<Escolaridade> list = new ArrayList<>();
        //list.add(e1);
        //list.add(e2);

        //yasmin.escolaridades = Arrays.asList(e1,e2);

        System.out.println("Nome Completo "+yasmin.nomeCompleto);
        System.out.println("Idade: "+yasmin.calcularIdade());
        System.out.println(" e maior de idade: " +yasmin.eMaiorDeIdade() );

        System.out.println("***********************************");

        System.out.println("Nome completo "+a.nomeCompleto);
        System.out.println("Idade: "+a.calcularIdade());
        System.out.println( " e maior de idade: " +a.eMaiorDeIdade());


         for (Escolaridade escolaridade : yasmin.escolaridades){
            System.out.println(escolaridade.nomeCurso+" - "
            + escolaridade.nomeInstituição);

            
            }
        }

    }

