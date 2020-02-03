package capgemini.firstproject.Books;

public abstract class MediaItem extends Item
{
	String producer;
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public abstract void Rating();
}
