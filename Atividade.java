public class Atividade{
   int id;
   Tema temaId;
   int numero;
   String descricao, formatoEntrega, dtInicio, dtFim;
   
   public Atividade(){
   }
   
   public Atividade(int id, int numero, String descricao, String formatoEntrega, String dtInicio, String dtFim, Tema temaId){
      this.id = id;
      this.numero = numero;
      this.descricao = descricao;
      this.formatoEntrega = formatoEntrega;
      this.dtInicio = dtInicio;
      this.dtFim = dtFim;
      this.temaId = temaId;
   }
   
   public int getId(){
      return id;
   }
   
   public int getNumero(){
      return numero;
   }
   
   public String getDescricao(){
      return descricao;
   }
   
   public String getFormatoEntrega(){
      return formatoEntrega;
   }
   
   public String getDtInicio(){
      return dtInicio;
   }
   
   public String getDtFim(){
      return dtFim;
   }
   
   public Tema getTemaId(){
      return temaId;
   }
   
   //Setters
   public void setId(int id){
      this.id = id;
   }
   
   public void setNumero(int numero){
      this.numero = numero;
   }
   
   public void setDescricao(String descricao){
      this.descricao = descricao;
   }
   
   public void setFormatoEntrega(String formatoEntrega){
      this.formatoEntrega = formatoEntrega;
   }
   
   public void setDtInicio(String dtInicio){
      this.dtInicio = dtInicio;
   }
   
   public void setDtFim(String dtFim){
      this.dtFim = dtFim;
   }
   
   public void setTemaId(Tema temaId){
      this.temaId = temaId;
   }
}