public class CombinationFacade {
    private String description = "";
    private double price = 0;
    private int gram = 0;
    private int ml = 0;
    private String size = "";
    
    private Burguer burguer = new Burguer();
    private Dessert dessert = new Dessert();
    private Drink drink = new Drink();
    
    public CombinationFacade () {}

    public void createCombination (int option) {
        if (option == 1) {
            this.description = "Combo Plus";
            this.price = 1.5;
            this.gram = 300;
            this.ml = 400;
            this.size = "Medio";
        }

        else if (option == 2) {
            this.description = "Combo Max";
            this.price = 3.5;
            this.gram = 150;
            this.ml = 600;
            this.size = "Grande";
        }

        this.burguer.setPrice(this.price);
        this.burguer.setDescription(this.description);
        this.burguer.setGram(this.gram);

        this.dessert.setPrice(this.price);
        this.dessert.setDescription(this.description);
        this.dessert.setSize(this.size);

        this.drink.setPrice(this.price);
        this.drink.setDescription(this.description);
        this.drink.setMl(this.ml);
    }

    @Override
    public String toString() {
        return 
            "\n=================Detalhes Burguer=================" +
            "\n== Preço:"+      this.burguer.getPrice()       + 
            "\n== Descrição:"+  this.burguer.getDescription() + 
            "\n== Grama:"+      this.burguer.getGram()        + 
            "\n=================Detalhes Sobremessa=================" +
            "\n== Preço:"+      this.dessert.getPrice()       + 
            "\n== Descrição:"+  this.dessert.getDescription() + 
            "\n== Tamanho:"+    this.dessert.getSize()        + 
            "\n=================Detalhes Bebida=================" +
            "\n== Preço:"+      this.drink.getPrice()         + 
            "\n== Descrição:"+  this.drink.getDescription()   + 
            "\n== Ml:"+         this.drink.getMl();
    }

}