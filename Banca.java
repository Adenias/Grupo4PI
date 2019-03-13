public class Banca{
   int id;
   String data, sala;
   Grupo grupoId;
   
   public Banca(){
   }
   
   public Banca(int id, String data, String sala, Grupo grupoId){
      this.id = id;
      this.data = data;
      this.sala = sala;
      this.grupoId = grupoId;
   }
   
   public int getId(){
      return id;
   }
   
   public String getData(){
      return data;
   }
   
   public String getSala(){
      return sala;
   }
   
   public Grupo getGrupoId(){
      return grupoId;
   }
   
   //Setters
   public void setId(int id){
      this.id = id;
   }
   
   public void setData(String data){
      this.data = data;
   }
   
   public void setSala(String sala){
      this.sala = sala;
   }
   
   public void setGrupoId(Grupo grupoId){
      this.grupoId = grupoId;
   }
}