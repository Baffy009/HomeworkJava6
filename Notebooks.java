public class Notebooks {
    private String name;
    private int ram;
    private int ssd;
    private double diagonal;
    private String os;
    private String color;    
    private int price;

    public Notebooks(String name, int ram, int ssd, double diagonal, String os, String color, int price){        
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.diagonal = diagonal;
        this.os = os;
        this.color = color;        
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Модель: %s\n  объем оперативной памяти: %d Гб\n  объем накопителя %d Гб \n  Диагональ %.1f \n  ОС %s \n  Цвет %s \n  Цена: %d \n", 
                    this.name, this.ram, this.ssd, this.diagonal, this.os, this.color, this.price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebooks) {
            return this.name.equals(((Notebooks) obj).name) && this.ram == ((Notebooks) obj).ram 
                                && this.ssd == ((Notebooks) obj).ssd 
                                && this.diagonal == ((Notebooks) obj).diagonal 
                                && this.os.equals(((Notebooks) obj).os) 
                                && this.color.equals(((Notebooks) obj).color) 
                                && this.price == ((Notebooks) obj).price ;
        }
        return false;        
    }

    public int getRam(){
        return this.ram;
    }
    public int getSsd(){
        return this.ssd;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
    public String getOS(){
        return this.os;
    }
    public int getPrice(){
        return this.price;
    }
}