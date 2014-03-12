public class Korekcija {
    
    int[] code = new int[7];
    int[] data = new int[4];
    public int p1;
    public int p2;
    public int p3;
    int errorPos = 0;
    
    public Korekcija(int[] data) {
        this.data = data; 
    }
    
    public static int parnost(int data1, int data2, int data3) {
        /*if((data1 + data2 + data3) %2 == 0) {
            return 0;
        } else {
            return 1;
        }*/
        return ((data1 + data2 + data3) % 2);
    }
    
    public void konstruisi() {
        p1 = parnost(data[0], data[1], data[3]);
        p2 = parnost(data[0], data[2], data[3]);
        p3 = parnost(data[1], data[2], data[3]);
        code[0] = p1;
        code[1] = data[0];
        code[2] = p2;
        code[3] = data[1];
        code[4] = p3;
        code[5] = data[2];
        code[6] = data[3];
    }
    
    public void promeni(int index) {
        /* if (code[index] == 1) {
            code[index] = 0;
        } else {
            code[index] = 1;
        } */
        
        code [index] = 1 - code[index];
    }
    
    public void prikazi() {
        /*for (int i = 0; i < code.length; i++) {
            System.out.print(code[i] + " ");
        }*/
        
        for (int i : code) {
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
    
    public void randomGreska() {
        int i = (int)(Math.random() * 10);
        if (i < 7) 
        promeni(i);
    }
    
    public int verifikuj() {
        int[] gresni = new int[4];
        gresni[0] = code[1];
        gresni[1] = code[3];
        gresni[2] = code[5];
        gresni[3] = code[6];
        
        int gp1 = parnost(gresni[0], gresni[1], gresni[3]);
        int gp2 = parnost(gresni[0], gresni[2], gresni[3]);
        int gp3 = parnost(gresni[1], gresni[2], gresni[3]);
        
        if(p1 != code[0]) {
            errorPos = 1;
            System.out.println("Pozicija pogresnog bita je " + errorPos);
            return errorPos;
        } else if(p2 != code[2]) {
            errorPos = 3;
            System.out.println("Pozicija pogresnog bita je " + errorPos);
            return errorPos;
        } else if(p3 != code[4]) {
            errorPos = 5;
            System.out.println("Pozicija pogresnog bita je " + errorPos);
            return errorPos;
        } else if(p1 != gp1 && p2 != gp2 && p3 == gp3) {
            errorPos = 2;
            System.out.println("Pozicija pogresnog bita je " + errorPos);
            return errorPos;
        } else if(p1 != gp1 && p3 != gp3 && p2 == gp2) {
            errorPos = 4;
            System.out.println("Pozicija pogresnog bita je " + errorPos);
            return errorPos;
        } else if(p2 != gp2 && p3 != gp3 && p1 == gp1) {
            errorPos = 6;
            System.out.println("Pozicija pogresnog bita je " + errorPos);
            return errorPos;
        } else if(p1 != gp1 && p2 != gp2 && p3 != gp3) {
            errorPos = 7;
            System.out.println("Pozicija pogresnog bita je " + errorPos);
            return errorPos;
        } else {
            System.out.println("Nije pronadjena greska u kodu");
            return errorPos;
        }
    }
    
    public void koriguj() {
        if (errorPos != 0) {
            promeni(errorPos - 1);
        }
    }
}
