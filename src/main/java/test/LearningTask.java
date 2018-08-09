package test;

public class LearningTask extends Task{
	private Integer id;
	private String title;
	private String body;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public LearningTask(Integer id, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
	}
	public LearningTask() {
		super();
		// TODO Auto-generated constructor stub
	}
}
