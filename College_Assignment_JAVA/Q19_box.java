public class Q19_box {
   
        double width, height, depth;
        
        Q19_box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }
        
        double volume() {
            return width * height * depth;
        }
        
        public static void main(String[] args) {
            Q19_box myBox = new Q19_box(10, 20, 15);
            System.out.println("Volume of the box: " + myBox.volume());
        }
    }
    

