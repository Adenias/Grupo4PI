public class Grupo{
   int id, numero;
   Professor orientador;
   String nome;
   
   public Grupo(){
   }
   
   public Grupo(int id, int numero, Professor orientador, String nome){
      this.id = id;
      this.numero = numero;
      this.orientador = orientador;
      this.nome = nome;
   }
   
   public int getId(){
      return id;
   }
   
   public int getNumero(){
      return numero;
   }
   
   public Professor getOrientador(){
      return orientador;
   }
   
   public String getNome(){
      return nome;
   }
   
   //Setters
   public void setId(int id){
      this.id = id;
   }
   
   public void setNumero(int numero){
      this.numero = numero;
   }
   
   public void setOrientador(Professor orientador){
      this.orientador = orientador;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
}