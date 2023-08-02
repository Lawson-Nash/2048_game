/*
* Name: Lawson Nash
* PennKey: nashlaw
*
*
* Description: This class creates a new instance of a tile, which will
* represent the squares in 2048. This class will handle the tile's
* appearance, the value/number on the block, and drawing the block. In
* addition, it will have boolean methods to check if tile's are empty.
*/

public class Tile {
    
    private int value; // the value of the tile.
    private double xPos, yPos, radius; // drawing variables for the tile. 
    
    
    // Constructor: creates a tile with default zero values for variables.
    public Tile() {
        value = 0;
        xPos = 0.0; 
        yPos = 0.0; 
    }
    
    // Constructor: creates a new instance of a tile with value. 
    public Tile(int value) {
        this.value = value;
        xPos = 0.0; 
        yPos = 0.0; 
    }
    
    // Getter and setter methods for the tile.
    /*
    * Input: n/a 
    * Output: int
    * Description: returns value of the tile. 
    */
    public int getValue() {
        return value;
    }
    
    /*
    * Input: int value
    * Output: void.
    * Description: sets value of the tile. 
    */
    public void setValue(int value) {
        this.value = value;
    }

    /* 
    * Input: double xPos
    * Output: void
    * Description: sets the xPos of the tile. 
    */
    public void setXpos(double xPos) {
        this.xPos = xPos; 
    }

    /* 
    * Input: double yPos
    * Output: void
    * Description: sets the yPos of the tile. 
    */
    public void setYpos(double yPos) {
        this.yPos = yPos; 
    }

    /* 
    * Input: double radius
    * Output: void
    * Description: sets the radius of the tile. 
    */
    public void setRadius(double radius) {
        this.radius = radius; 
    } 
    
    /*
    *
    * Input: n/a
    * Output: string representation of the tile's value.
    * Description: this toString method returns the value of the tile.
    *
    */
    
    public String toString() {
        return "Tile value: " + value;
    }
    
    /*
    *
    * Input: another Tile.
    * Output: boolean
    * Description: this method returns true if two tile's values are equal.
    *
    */
    public boolean isEqual(Tile otherTile) {
        return otherTile.value == value;
    }
    
    /*
    *
    * Input: n/a
    * Output: boolean
    * Description: this method returns true if a tile has a value equal to 0.
    *
    */
    public boolean isEmpty() {
        return value == 0;
    }

    /* 
    * 
    * Input: n/a 
    * Output: void 
    * Description: draws the tile.
    * 
    */ 
    public void draw() {
        // only draws tile if it has value above 0. 
        if (!isEmpty()) {
            if (value == 2) {
                // setting pen color. 
                PennDraw.setPenColor(172, 166, 178); // grey
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else if (value == 4) {
                // setting pen color. 
                PennDraw.setPenColor(119, 109, 70); // beige
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else if (value == 8) {
                // setting pen color. 
                PennDraw.setPenColor(255, 79, 25); // orange
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else if (value == 16) {
                // setting pen color. 
                PennDraw.setPenColor(255, 139, 104); // light orange 
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else if (value == 32) {
                // setting pen color. 
                PennDraw.setPenColor(104, 255, 242); // light blue 
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else if (value == 64) {
                // setting pen color. 
                PennDraw.setPenColor(0, 79, 252); // royal blue 
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 
       
            } else if (value == 128) {
                // setting pen color. 
                PennDraw.setPenColor(182, 0, 255); // violet
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else if (value == 256) { 
                // setting pen color. 
                PennDraw.setPenColor(135, 0, 255); // purple
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else if (value == 512) {
                // setting pen color. 
                PennDraw.setPenColor(246, 0, 255); // pink
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else if (value == 1024) { 
                // setting pen color. 
                PennDraw.setPenColor(255, 0, 0); // red
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            } else {
                // setting pen color. 
                PennDraw.setPenColor(55, 255, 0); // light green
                // drawing tile. 
                PennDraw.filledSquare(xPos, yPos, radius);
                PennDraw.setPenColor(0, 0, 0);  
                PennDraw.square(xPos, yPos, radius); 
                // drawing value.
                PennDraw.text(xPos, yPos, "" + value); 

            }
        }
    }
}
