import android.graphics.drawable.Drawable;

/**
 * Created by Arya Kamandanu on 22/11/2016.
 */
public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;
    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul= judul;
        this.deskripsi =deskripsi;
        this.foto   = foto;
    }
}
