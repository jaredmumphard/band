package Week9;
import java.util.Scanner;
public class FluidParticles {
    private int tag;
    private double xPosition;
    private double yPosition;

    public FluidParticles(int tag) {
        this.tag = tag;
        this.xPosition = 0.0;
        this.yPosition = 0.0;
    }

    public void move(double deltaX, double deltaY) {
        xPosition += deltaX;
        yPosition += deltaY;
    }

    public String toString() {
        return String.format("Particle %d is at (%.1f,%.1f)", tag, xPosition, yPosition);
    }

    public class FluidParticlesDriver {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Particle tag id? : ");
            int tag = scanner.nextInt();
            FluidParticles particles = new FluidParticles(tag);
            System.out.println(particles);

            while (true) {
                System.out.print("Enter movement  : ");
                double deltaX = scanner.nextDouble();
                double deltaY = scanner.nextDouble();

                if (deltaX == 0.0 && deltaY == 0.0) {
                    break;
                }
                particles.move(deltaX, deltaY);
                System.out.println(particles);
            }
            scanner.close();
        }
    }
}

