import static java.lang.Math.sqrt;

public class Vector4 {
    public double x;
    public double y;
    public double z;
    public double w;

    public Vector4(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }

    public Vector4(double x, double y, double z, double w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public void add(Vector4 otherVec){
        this.x += otherVec.x;
        this.y += otherVec.y;
        this.z += otherVec.z;
        this.w += otherVec.w;
    }

    public static Vector4 add(Vector4 vec1, Vector4 vec2){
        return new Vector4(vec1.x + vec2.x, vec1.y + vec2.y, vec1.z + vec2.z, vec1.w + vec2.w);
    }

    public void subtract(Vector4 otherVec){
        this.x -= otherVec.x;
        this.y -= otherVec.y;
        this.z -= otherVec.z;
        this.w -= otherVec.w;
    }

    public static Vector4 subtract(Vector4 vec1, Vector4 vec2){
        return new Vector4(vec1.x - vec2.x, vec1.y - vec2.y, vec1.z - vec2.z, vec1.w - vec2.w);
    }

    public void multiply(Vector4 otherVec){
        this.x *= otherVec.x;
        this.y *= otherVec.y;
        this.z *= otherVec.z;
        this.w *= otherVec.w;
    }

    public void multiply(double multiplier){
        this.x *= multiplier;
        this.y *= multiplier;
        this.z *= multiplier;
        this.w *= multiplier;
    }

    public static Vector4 multiply(Vector4 vec1, Vector4 vec2){
        return new Vector4(vec1.x * vec2.x, vec1.y * vec2.y, vec1.z * vec2.z, vec1.w * vec2.w);
    }

    public static Vector4 multiply(Vector4 vec, double multiplier){
        return new Vector4(vec.x * multiplier, vec.y * multiplier, vec.z * multiplier, vec.w * multiplier);
    }

    public void divide(Vector4 otherVec){
        this.x /= otherVec.x;
        this.y /= otherVec.y;
        this.z /= otherVec.z;
        this.w /= otherVec.w;
    }

    public void divide(double divisor){
        this.x /= divisor;
        this.y /= divisor;
        this.z /= divisor;
        this.w /= divisor;
    }

    public static Vector4 divide(Vector4 vec1, Vector4 vec2){
        return new Vector4(vec1.x / vec2.x, vec1.y / vec2.y, vec1.z / vec2.z, vec1.w / vec2.w);
    }

    public static Vector4 divide(Vector4 vec, double divisor){
        return new Vector4(vec.x / divisor, vec.y / divisor, vec.z / divisor, vec.w / divisor);
    }

    public double magnitude(){
        return sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z) + (this.w * this.w));
    }

    public Vector4 normalized(){
        return divide(this, this.magnitude());
    }
}
