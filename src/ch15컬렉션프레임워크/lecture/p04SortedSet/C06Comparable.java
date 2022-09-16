package ch15컬렉션프레임워크.lecture.p04SortedSet;

import java.util.TreeSet;

public class C06Comparable {
	public static void main(String[] args) {
		TreeSet<Computer> computers = new TreeSet<Computer>();
		
		computers.add(new Computer(3, 2));
		computers.add(new Computer(3, 4));
		computers.add(new Computer(7, 2));
		
		System.out.println(computers);
	}
}

class Computer implements Comparable<Computer> {
	private int CPU;
	private int ram;
	
	public Computer(int cPU, int ram) {
		super();
		CPU = cPU;
		this.ram = ram;
	}

	public int getCPU() {
		return CPU;
	}

	public void setCPU(int cPU) {
		CPU = cPU;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", ram=" + ram + "]";
	}

	//compareTo 재정의했으면, equals,hashcode 또한 재정의 꼭해줘야한다. 강력한게 추천한다..
	@Override
	public int compareTo(Computer o) {
		
		int cpuDiff = this.CPU - o.CPU; 
		
		if (cpuDiff ==0) {
			
			return this.ram - o.ram;
			
		}
		return cpuDiff;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CPU;
		result = prime * result + ram;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (CPU != other.CPU)
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}
	
	
	
	
	
}
