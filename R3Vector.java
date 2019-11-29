class R3Vector {
    private double x, y, z;
    private R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public R3Vector() throws Exception {
        x = Xterm.inputDouble("x -> ");
        y = Xterm.inputDouble("y -> ");
        z = Xterm.inputDouble("z -> ");
    }
    public static R3Vector sum(R3Vector a, R3Vector b) {                    //Сумма 2-х векторов
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }
    public static R3Vector diff(R3Vector a, R3Vector b) {                   //Разность 2-х векторов
        return new R3Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }
    public static R3Vector multi(R3Vector a, double k) {                    //Произведение вектора и числа
        return new R3Vector(k * a.x, k * a.y, k * a.z);
    }
    public static double scal(R3Vector a, R3Vector b) {                     //Скалярное произведение 2-х векторов
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }
    public static R3Vector vect(R3Vector a, R3Vector b) {                   //Векторное произведение 2-х векторов
        return new R3Vector(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x);
    }
    public static double mixed(R3Vector a, R3Vector b, R3Vector c){         //Смешанное произведение 3-х векторов
        return (a.z * b.y * c.x) + (c.z * b.x * a.y) + (a.x * c.y * b.z) - (a.x * b.y * c.z) - (a.z * b.x * c.y) - (c.x * a.y * b.z);
    }
}