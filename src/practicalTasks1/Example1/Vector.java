package practicalTasks1.Example1;

public class Vector {
    public static void main(String[] args) {
        Vector[] arr = new Vector[10];
        arr = Vector.arrayRandomN(5);
        for (int i = 0; i < 5; i++) {
           System.out.printf("%.2f %.2f %.2f --", arr[i].x, arr[i].y, arr[i].z);
           //System.out.printf("число %.2f ", arr[i].x);
        }


    }
    private  double x = 0;
    private  double y = 0;
    private  double z = 0;
    public  Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void vectorSetX(double x) {
        this.x = x;
    }
    public void vectorSetY(double y) {
        this.y = y;
    }
    public void vectorSetZ(double z) {
        this.z = z;
    }
    public double vectorLength() {
        double len = Math.sqrt(x*x + y*y + z*z);
        return len;
    }
    public double scalarProtuct(Vector a, Vector b) {
        double rezult = a.x * b.x + a.y * b.y + a.z * b.z;
        return rezult;
    }
    public Vector vectorProduct(Vector a, Vector b) {
        double x = a.y * b.z - a.z * b.y;
        double y = a.z * b.x - a.x * b.z;
        double z = a.x * b.y - a.y * b.x;
        return new Vector(x, y, z);
    }
    public double cosVector(Vector a, Vector b) {
        double prod = scalarProtuct(a, b);
        double lenLen = a.vectorLength() * b.vectorLength();
        return prod/lenLen;
    }
    public Vector vectorSum(Vector a, Vector b) {
        return new Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }
    public Vector vectorDiff(Vector a, Vector b) {
        return new Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }
    public static Vector[] arrayRandomN(int n) {
        Vector[] newArrrayRandomN = new Vector[n];
        for (int i = 0; i < n; i++) {
            newArrrayRandomN[i] = new Vector(Math.random() * 10, Math.random() * 10,Math.random() * 10);
//            newArrrayRandomN[i].vectorSetX(Math.random() * 10);
//            newArrrayRandomN[i].vectorSetY(Math.random() * 10);
//            newArrrayRandomN[i].vectorSetZ(Math.random() * 10);
        }
        return newArrrayRandomN;
    }
}
