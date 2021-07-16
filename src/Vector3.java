import static java.lang.Math.sqrt;

public class Vector3 {
    public double x;
    public double y;
    public double z;

    public Vector3(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void add(Vector3 otherVec){
        this.x += otherVec.x;
        this.y += otherVec.y;
        this.z += otherVec.z;
    }

    public static Vector3 add(Vector3 vec1, Vector3 vec2){
        return new Vector3(vec1.x + vec2.x, vec1.y + vec2.y, vec1.z + vec2.z);
    }

    public void subtract(Vector3 otherVec){
        this.x -= otherVec.x;
        this.y -= otherVec.y;
        this.z -= otherVec.z;
    }

    public static Vector3 subtract(Vector3 vec1, Vector3 vec2){
        return new Vector3(vec1.x - vec2.x, vec1.y - vec2.y, vec1.z - vec2.z);
    }

    public void multiply(Vector3 otherVec){
        this.x *= otherVec.x;
        this.y *= otherVec.y;
        this.z *= otherVec.z;
    }

    public void multiply(double multiplier){
        this.x *= multiplier;
        this.y *= multiplier;
        this.z *= multiplier;
    }

    public static Vector3 multiply(Vector3 vec1, Vector3 vec2){
        return new Vector3(vec1.x * vec2.x, vec1.y * vec2.y, vec1.z * vec2.z);
    }

    public static Vector3 multiply(Vector3 vec, double multiplier){
        return new Vector3(vec.x * multiplier, vec.y * multiplier, vec.z * multiplier);
    }

    public void divide(Vector3 otherVec){
        this.x /= otherVec.x;
        this.y /= otherVec.y;
        this.z /= otherVec.z;
    }

    public void divide(double divisor){
        this.x /= divisor;
        this.y /= divisor;
        this.z /= divisor;
    }

    public static Vector3 divide(Vector3 vec1, Vector3 vec2){
        return new Vector3(vec1.x / vec2.x, vec1.y / vec2.y, vec1.z / vec2.z);
    }

    public static Vector3 divide(Vector3 vec, double divisor){
        return new Vector3(vec.x / divisor, vec.y / divisor, vec.z / divisor);
    }

    public double magnitude(){
        return sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    public Vector3 normalized(){
        return divide(this, this.magnitude());
    }
}
