package Week9;

import java.util.Scanner;

public class FluidParticlesDriver {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Particle tag id? : ");
            int tag = scanner.nextInt();
            FluidParticles particles = new FluidParticles(tag);
            System.out.println(particles);

            while(true) {
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
