/**
 * Rectangle class represents a rectangle with width and height.
 * It overrides the equals() method to compare two rectangles.
 */
public class Rectangle {

    int width;
    int height;

    /**
     * Constructor to initialize width and height
     */
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    /**
     * Overrides equals() from Object class
     * Two rectangles are equal if their width and height are the same
     */
    @Override
    public boolean equals(Object obj) {

        // Check if the object is the same reference
        if (this == obj) {
            return true;
        }

        // Check if object is null or not Rectangle
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast object to Rectangle
        Rectangle rect = (Rectangle) obj;

        // Compare width and height
        return this.width == rect.width && this.height == rect.height;
    }
}
