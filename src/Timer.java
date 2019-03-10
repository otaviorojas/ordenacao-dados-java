
public class Timer {

	private long start;
	private long end;
	
	public long timerStart() {
		return this.start = System.currentTimeMillis();
	}
	
	public long timerEnd() {
		return this.end = System.currentTimeMillis();
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}
	
	@Override
	public String toString() {
		return "\nTimer [start=" + this.start + ", end=" + this.end + ", elapsed time=" + (this.end - this.start)  +"ms]";
	}

	
}
