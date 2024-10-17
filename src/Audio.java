public class Audio {
    //creamos las variables con las que vamos a trabajar
    private String name;
    private int duration;
    private int totalReproductions;
    private int liked;
    private int clasification;

    //implementamos los getter y setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public int getClasification() {
        return clasification;
    }

    public void setClasification(int clasification) {
        this.clasification = clasification;
    }

    //agregamos el metodo megusta
    private void like(){

    }

    //agregamos el metodo reproducir
    private void reproduction(){

    }
}
