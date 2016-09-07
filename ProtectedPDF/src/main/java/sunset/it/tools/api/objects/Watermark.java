package sunset.it.tools.api.objects;

public class Watermark {

	/*****
	 * 
	 * Watermark {
		Id (string, optional),
		Name (string, optional),
		SetContentAt (string, optional),
		FontName (string, optional),
		FontSize (integer, optional),
		Color (string, optional),
		PositionX (number, optional),
		PositionY (number, optional),
		Width (number, optional),
		Height (number, optional),
		Rotation (integer, optional),
		VisibleOnScreen (boolean, optional),
		VisibleOnPrint (boolean, optional),
		Opacity (number, optional),
		Repeat (boolean, optional),
		TextualContent (string, optional),
		SkipPages (string, optional),
		IsTrueWatermark (boolean, optional),
		CustomField (string, optional)
		}
	 * 
	 */

	private String Id;
	private String Name;
	private String SetContentAt;
	private String FontName;
	private int FontSize;
	private String Color;
	private int PositionX;
	private int PositionY;
	private int Width;
	private int Height;
	private int Rotation;
	private boolean VisibleOnScreen;
	private boolean VisibleOnPrint;
	private float Opacity;
	private boolean Repeat;
	private String TextualContent;
	private String SkipPages;
	private boolean IsTrueWatermark;
	private String CustomField;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSetContentAt() {
		return SetContentAt;
	}
	public void setSetContentAt(String setContentAt) {
		SetContentAt = setContentAt;
	}
	public String getFontName() {
		return FontName;
	}
	public void setFontName(String fontName) {
		FontName = fontName;
	}
	public int getFontSize() {
		return FontSize;
	}
	public void setFontSize(int fontSize) {
		FontSize = fontSize;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getPositionX() {
		return PositionX;
	}
	public void setPositionX(int positionX) {
		PositionX = positionX;
	}
	public int getPositionY() {
		return PositionY;
	}
	public void setPositionY(int positionY) {
		PositionY = positionY;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getRotation() {
		return Rotation;
	}
	public void setRotation(int rotation) {
		Rotation = rotation;
	}
	public boolean isVisibleOnScreen() {
		return VisibleOnScreen;
	}
	public void setVisibleOnScreen(boolean visibleOnScreen) {
		VisibleOnScreen = visibleOnScreen;
	}
	public boolean isVisibleOnPrint() {
		return VisibleOnPrint;
	}
	public void setVisibleOnPrint(boolean visibleOnPrint) {
		VisibleOnPrint = visibleOnPrint;
	}
	public float getOpacity() {
		return Opacity;
	}
	public void setOpacity(float opacity) {
		Opacity = opacity;
	}
	public boolean getRepeat() {
		return Repeat;
	}
	public void setRepeat(boolean repeat) {
		Repeat = repeat;
	}
	public String getTextualContent() {
		return TextualContent;
	}
	public void setTextualContent(String textualContent) {
		TextualContent = textualContent;
	}
	public String getSkipPages() {
		return SkipPages;
	}
	public void setSkipPages(String skipPages) {
		SkipPages = skipPages;
	}
	public boolean isIsTrueWatermark() {
		return IsTrueWatermark;
	}
	public void setIsTrueWatermark(boolean isTrueWatermark) {
		IsTrueWatermark = isTrueWatermark;
	}
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	@Override
	public String toString() {
		return "Watermark [Id=" + Id + ", Name=" + Name + ", SetContentAt=" + SetContentAt + ", FontName=" + FontName
				+ ", FontSize=" + FontSize + ", Color=" + Color + ", PositionX=" + PositionX + ", PositionY="
				+ PositionY + ", Width=" + Width + ", Height=" + Height + ", Rotation=" + Rotation
				+ ", VisibleOnScreen=" + VisibleOnScreen + ", VisibleOnPrint=" + VisibleOnPrint + ", Opacity=" + Opacity
				+ ", Repeat=" + Repeat + ", TextualContent=" + TextualContent + ", SkipPages=" + SkipPages
				+ ", IsTrueWatermark=" + IsTrueWatermark + ", CustomField=" + CustomField + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
