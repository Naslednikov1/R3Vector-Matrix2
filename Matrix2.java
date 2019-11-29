public class Matrix2 {
    private static double a, b, c, d;
    private Matrix2(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Matrix2() throws Exception {
        a = Xterm.inputDouble("a -> ");
        b = Xterm.inputDouble("b -> ");
        c = Xterm.inputDouble("c -> ");
        d = Xterm.inputDouble("d -> ");
    }
    public static Matrix2 sum(Matrix2 m, double k){             //Сумма матрицы и числа
        return new Matrix2(m.a + k, m.b + k, m.c + k, m.d + k);
    }
    public static Matrix2 diff(Matrix2 m, double k){            //Разность матрицы и числа
        return new Matrix2(m.a - k, m.b - k, m.c - k, m.d - k);
    }
    public static Matrix2 multi(Matrix2 m, double k){           //Произведение матрицы и числа
        return new Matrix2(m.a * k, m.b * k, m.c * k, m.d * k);
    }
    public static Matrix2 multimatrix(Matrix2 m, Matrix2 n){    //Произведение 2-х матриц
        return new Matrix2(m.a * n.a + m.b * n.c, m.a * n.b + m.b * n.d, m.c * n.a + m.d * n.c, m.c * n.b + m.d * n.d);
    }
    public static double det(Matrix2 m){                        //Вычисление определителя
        return (m.a * m.d) - (m.b * m.c);
    }
    public static Matrix2 reversed(Matrix2 m){                  //Вычисление обратной матрицы
        return new Matrix2(d / det(m), - (b / det(m)), - (c / det(m)), a / det(m));
    }
}
