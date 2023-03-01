package Java_DZ.DZ6;


public class Notebook {

    final int id;
    String manufacturer;
    String model;
    double screenSize;
    String discretVideoAdapter;
    int cpuCores;
    double cpu;
    int RAM;
    int HDD;

    Notebook() {   // Для тестирования при необходимости быстро добавить
        id = ++idStart;
        manufacturer = "unknown";
        model = "unknown";
        screenSize = 0;
        discretVideoAdapter = "unknown";
        cpuCores = 0;
        cpu = 0;
        RAM = 0;
        HDD = 0;
    }

    Notebook(String manufacturer, String model, double screenSize, String discretVideoAdapter,
             int cpuCores, double cpu, int RAM, int HDD) {
        id = ++idStart;
        this.manufacturer = manufacturer.toLowerCase().trim();
        this.model = model.toLowerCase().trim();
        this.screenSize = screenSize;
        this.discretVideoAdapter = discretVideoAdapter.toLowerCase().trim();
        this.cpuCores = cpuCores;
        this.cpu = cpu;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public String toString() {
        return "Производитель = '" + manufacturer.toUpperCase() + '\'' +
                ", Модель = '" + model.toUpperCase() + '\'' +
                ", Размер монитора =" + screenSize +
                ", Дискретная видеокарта ='" + discretVideoAdapter.toUpperCase() + '\'' +
                ", Количество ядер ЦП =" + cpuCores +
                ", Частота ядер =" + cpu + "Ghz" +
                ", RAM = " + RAM + "Gb" +
                ", HDD/SSD = " + HDD + "Gb";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return manufacturer.equals(notebook.manufacturer) && model.equals(notebook.model) &&
                screenSize == notebook.screenSize && discretVideoAdapter.equals(notebook.discretVideoAdapter) &&
                cpuCores == notebook.cpuCores && cpu == notebook.cpu && RAM == notebook.RAM &&
                HDD == notebook.HDD;
    }

    public int hashCode() {
        return manufacturer.hashCode() + 19 * model.hashCode() + 7 * discretVideoAdapter.hashCode() + 11 * RAM + 3 * HDD + 13 * cpuCores +
                17 * (int) cpu + 5 * (int) screenSize;
    }

    private static int idStart = 0;
}
