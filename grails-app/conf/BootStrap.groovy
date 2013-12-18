class BootStrap {

    def init = { servletContext ->

        Locale.setDefault(new Locale("ru"));

    }
    def destroy = {
    }
}
