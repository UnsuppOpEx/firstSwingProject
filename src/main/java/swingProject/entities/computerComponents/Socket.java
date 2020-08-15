package swingProject.entities.computerComponents;

/**
 * Список сокетов для Материнской платы и Процессора
 */

public enum Socket {

    LGA1366(1, "LGA1366"),
    LGA1156(2, "LGA1156"),
    LGA1155(3, "LGA1155"),
    LGA1150(4, "LGA1150"),
    LGA1151(5, "LGA1151"),
    LGA2066(6, "LGA2066"),
    LGA1200(7, "LGA1200"),
    AM2(8, "AM2"),
    AM3(9, "AM3"),
    FM1(10, "FM1"),
    FM2(11, "FM2"),
    AM4(12, "AM4"),
    TR4(13, "TR4");

    int id;
    String str;

    Socket(int id, String str) {
        this.id = id;
        this.str = str;
    }

    public int getId() {
        return id;
    }

    public String getStr() {
        return str;
    }

    /**
     * Возвращает стороковое представление Socket из массива
     * @param str
     * @return
     */
    public static Socket getSocketName(String str) {
        for (Socket socket : Socket.values()) {
            if (socket.getStr().equals(str))
                return socket;
        }
             throw new AssertionError("Socket не найден");
    }

    /**
     * Возвращает идентификатор Socket
     * @param id
     * @return
     */
    public static Socket getSocketId(int id) {
        for (Socket socket : Socket.values()) {
            if (socket.getId() == id)
                return socket;
        }
             throw new AssertionError("Socket не найден");
    }
}
