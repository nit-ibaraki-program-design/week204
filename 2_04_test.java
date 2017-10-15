class Pd4test {
    public static void main(String[] args) {
	Car c1 = new Car();
	c1.setNum(1234);
	c1.setGas(15.7);
	c1.show();
	System.out.println("getNum: " + c1.getNum());
	System.out.println("getGas: " + c1.getGas());
	System.out.println("走行可能距離: " + c1.distance() + "km");
    }
}
