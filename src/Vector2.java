import static java.lang.Math.sqrt;

// Vector2 datatype and math methods
public class Vector2 {
    public double x; // X variable
    public double y; // Y variable

    public Vector2(){ // Empty parameter constructor sets both X and Y to 0
        this.x = 0;
        this.y = 0;
    }

    public Vector2(double x, double y){ // Constructor sets X and Y to inputted values
        this.x = x;
        this.y = y;
    }

    public void add(Vector2 otherVec){ // Addition method. MUST USE BY CALLING [Vector2 Name Here].add(otherVec);
        // Adds values of otherVec to the original Vector2
        this.x += otherVec.x;
        this.y += otherVec.y;
    }

    public static Vector2 add(Vector2 vec1, Vector2 vec2){ // Addition method
        // Creates new Vector2 with the added values
        return new Vector2(vec1.x + vec2.x, vec1.y + vec2.y);
    }

    public void subtract(Vector2 otherVec){ // Subtraction method
        // Subtracts values of otherVec from the original Vector2
        this.x -= otherVec.x;
        this.y -= otherVec.y;
    }

    public static Vector2 subtract(Vector2 vec1, Vector2 vec2){ // Subtraction method
        // Creates new Vector2 with the subtracted values
        return new Vector2(vec1.x - vec2.x, vec1.y - vec2.y);
    }

    public void multiply(Vector2 otherVec){ // Multiplication method
        // Multiplies the original Vector2 with otherVec
        this.x *= otherVec.x;
        this.y *= otherVec.y;
    }

    public void multiply(double multiplier){ // Multiplication method
        // Multiplies the original Vector2 with the multiplier
        this.x *= multiplier;
        this.y *= multiplier;
    }

    public static Vector2 multiply(Vector2 vec1, Vector2 vec2){ // Multiplication method
        // Creates a new Vector2 that is the product of the two inputted
        return new Vector2(vec1.x * vec2.x, vec1.y * vec2.y);
    }

    public static Vector2 multiply(Vector2 vec, double multiplier){ // Multiplication method
        // Creates a new Vector2 that is the product of the Vector2 and the multiplier
        return new Vector2(vec.x * multiplier, vec.y * multiplier);
    }

    public void divide(Vector2 otherVec){ // Division method
        // Divides the original Vector2 by otherVec
        this.x /= otherVec.x;
        this.y /= otherVec.y;
    }

    public void divide(double divisor){ // Division method
        // Divides the original Vector2 by the divisor
        this.x /= divisor;
        this.y /= divisor;
    }

    public static Vector2 divide(Vector2 vec1, Vector2 vec2){ // Division method
        // Creates a new Vector2 that is the quotient of vec1 and vec2
        return new Vector2(vec1.x / vec2.x, vec1.y / vec2.y);
    }

    public static Vector2 divide(Vector2 vec, double divisor){ // Division method
        // Creates a new Vector2 that is the quotient of the Vector2 and the divisor
        return new Vector2(vec.x / divisor, vec.y / divisor);
    }

    public double magnitude(){
        // Returns the length of the Vector2
        return sqrt((this.x * this.x) + (this.y * this.y));
    }

    public Vector2 normalized(){
        // Returns a Vector2 that is the same as the original, but with a length of 1
        return divide(this, this.magnitude());
    }
}
