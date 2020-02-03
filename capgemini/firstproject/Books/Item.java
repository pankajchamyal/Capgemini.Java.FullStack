package capgemini.firstproject.Books;

public abstract class Item
{
	String Title;long UID;int copies;
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public long getUID() {
		return UID;
	}

	public void setUID(long uID) {
		UID = uID;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
