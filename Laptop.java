// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих


public class Laptop{
    private Integer id;
    private String brand;
    private String name;
    private String color;
    private Double size;
    private Integer ram;
    private Integer hardDiskSpace;
    private String operatingSystem;

    public Laptop(Integer id, String brand, String name, String color, Double size, Integer ram, Integer hardDiskSpace, String operatingSystem){
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.size = size;
        this.ram = ram;
        this.hardDiskSpace = hardDiskSpace;
        this.operatingSystem = operatingSystem;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public void setColor(String color) {
    //     this.color = color;
    // }

    // public void setSize(Double size) {
    //     this.size = size;
    // }

    // public void setRam(Integer ram) {
    //     this.ram = ram;
    // }

    // public void setHardDiskSpace(Integer hardDiskSpace) {
    //     this.hardDiskSpace = hardDiskSpace;
    // }

    // public void setOperatingSystem(String operatingSystem) {
    //     this.operatingSystem = operatingSystem;
    // }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getHardDiskSpace() {
        return hardDiskSpace;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public Double getSize() {
        return size;
    }
    @Override
    public String toString() {
        return brand +" "+ name;
    }
}