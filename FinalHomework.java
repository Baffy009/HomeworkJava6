import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FinalHomework {
    
    public static void main(String[] args) {
        int count = 0;
        
        Notebooks itemtop1 = new Notebooks("Lenovo", 16, 256, 14.4, "Windows 7", "черный", 40000);
        Notebooks itemtop2 = new Notebooks("MAC", 16, 1024, 15.6, "Windows 10", "серебристый", 125000);
        Notebooks itemtop3 = new Notebooks("Huawei", 8, 512, 15.4, "Linux", "серый", 41000);
        Notebooks itemtop4 = new Notebooks("HP", 16, 256, 15.0, "Windows 10", "белый", 84000);
        Notebooks itemtop5 = new Notebooks("Acer", 16, 512, 15.6,"Windows 7", "черный", 34000);
        Notebooks itemtop6 = new Notebooks("Toshiba", 32, 1024, 15.6, "без ОС", "серебристый", 56000);
        Notebooks itemtop7 = new Notebooks("Starwind", 16, 512, 15.6, "Windows 11", "черный", 91000);
        Notebooks itemtop8 = new Notebooks("Xiomi", 8, 256, 15.4, "Windows 10", "серый", 59000);

        Set<Notebooks> unicalitemtop = new HashSet<Notebooks>();
        unicalitemtop.add(itemtop1);
        unicalitemtop.add(itemtop2);
        unicalitemtop.add(itemtop3);
        unicalitemtop.add(itemtop4);
        unicalitemtop.add(itemtop5);
        unicalitemtop.add(itemtop6);
        unicalitemtop.add(itemtop7);
        unicalitemtop.add(itemtop8);        

        Map<Integer, String> mapCharact = new HashMap<>();
        mapCharact.put(1, "объем оперативной памяти");
        mapCharact.put(2, "объем накопителя");
        mapCharact.put(3, "ОС");
        mapCharact.put(4, "цвет");
        mapCharact.put(5, "диагональ");
        mapCharact.put(6, "цена");

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики (если характеристика не важна введите 0):");
        System.out.print("объем оперативной памяти > ");
        int ramFind = scaner.nextInt();
        System.out.print("объем накопителя > ");
        int ssdFind = scaner.nextInt();        
        System.out.print("диагональ > ");
        double diagFind = scaner.nextDouble();
        System.out.print("максимальная цена или введите 111111 > ");
        double priceFind = scaner.nextInt();
        System.out.println();
        scaner.close();

        for(Notebooks item: unicalitemtop) {
            if ((item.getRam() >= ramFind) && (item.getSsd() >= ssdFind)  && item.getDiagonal() >= diagFind && (item.getPrice() <= priceFind)) {
                System.out.println(item.toString());
                count ++;
            }
        }
        
        if (count == 0){
            System.out.println("совпадений не найдено, попобуйте изменить параметры поиска.");
        }else{
            System.out.println("[найдено " + count + " совпадений]" );
        }
    }
}