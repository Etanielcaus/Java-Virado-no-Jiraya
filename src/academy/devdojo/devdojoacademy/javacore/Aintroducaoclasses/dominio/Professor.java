package academy.devdojo.devdojoacademy.javacore.Aintroducaoclasses.dominio;

public class Professor {
    public String nome;
    public int idade;
    public char sexo;

    public void checarsemaior(){
        if (idade > 18){
            System.out.println("Permitido dar aula");
        } else {
            System.out.println("Não permitido dar aula");
        }
    }
}
