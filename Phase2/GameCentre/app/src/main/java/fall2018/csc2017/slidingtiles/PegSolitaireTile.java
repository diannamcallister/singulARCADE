package fall2018.csc2017.slidingtiles;

import android.support.annotation.NonNull;

import java.io.Serializable;

/**
 * A PegSolitaire Tile in a sliding tiles puzzle.
 */
public class PegSolitaireTile implements Comparable<PegSolitaireTile>, Serializable {
    /**
     * The background id to find the peg solitaire tile image.
     */
    private int background;

    /**
     * The unique id.
     */
    private int id;

    /**
     * Return the background id.
     *
     * @return the background id
     */
    public int getBackground() {
        return background;
    }

    /**
     * Return the PegSolitaire tile id.
     *
     * @return the tile id
     */
    public int getId() {
        return id;
    }

    /**
     * A PegSolitaireTile with id and background. The background may not have a corresponding image.
     *
     * @param id         the id
     * @param background the background
     */
    PegSolitaireTile(int id, int background) {
        this.id = id;
        this.background = background;
    }

    /**
     * A PegSolitaire tile with a background id; look up and set the id.
     *
     * @param backgroundId the background id of the tile
     */
    PegSolitaireTile(int backgroundId) {
        switch (backgroundId) {
            case 0:
                background = R.drawable.tile_blank;
                break;
            case 1:
                background = R.drawable.tile_1;
                break;
            case 2:
                background = R.drawable.tile_2;
                break;
            default:
                background = R.drawable.tile_blank;
        }
    }
    @Override
    public int compareTo(@NonNull PegSolitaireTile o) {
        return o.id - this.id;
    }

    public void setId(int i) {
        this.id = i;
        setBackground(i);
    }

    public void setBackground(int i) {
        switch (i) {
            case 0:
                background = R.drawable.tile_1;
                break;
            case 1:
                background = R.drawable.tile_2;
                break;
            case 2:
                background = R.drawable.tile_3;
                break;
            default:

        }
    }
}
