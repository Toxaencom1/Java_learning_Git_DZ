package Java_DZ.DZ6;


public class Notebook {
    private final int id;
    private String manufacturer;
    private String model;
    private double screenSize;
    private String discretVideoAdapter;
    private int cpuCores;
    private double cpu;
    private int RAM;
    private int HDD;
    private static int idStart = 0;

    Notebook() {   // Для тестирования при необходимости быстро добавить
        id = idStart++;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getDiscretVideoAdapter() {
        return discretVideoAdapter;
    }

    public void setDiscretVideoAdapter(String discretVideoAdapter) {
        this.discretVideoAdapter = discretVideoAdapter;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }
    public int getId() {
        return id;
    }
}
