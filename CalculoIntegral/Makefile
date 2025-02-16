# Variables
JAVAC = javac
JAVA = java
SRC_DIR = src
BIN_DIR = bin

# Paquetes
PACKAGE_APLICACION = aplicacion
PACKAGE_MATES = mates

# Archivos fuente
SRC = $(SRC_DIR)/$(PACKAGE_APLICACION)/CalculoIntegralMain.java $(SRC_DIR)/$(PACKAGE_MATES)/Matematicas.java
CLASSES = $(BIN_DIR)/$(PACKAGE_APLICACION)/CalculoIntegralMain.class $(BIN_DIR)/$(PACKAGE_MATES)/Matematicas.class
MAIN_CLASS = aplicacion.CalculoIntegralMain

# Crear la carpeta bin si no existe
$(BIN_DIR):
	mkdir -p $(BIN_DIR)

# Regla por defecto: compilar y ejecutar
all: $(BIN_DIR) $(CLASSES)
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

# Compilar los archivos
$(CLASSES): $(SRC) | $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SRC)

# Limpiar archivos compilados
clean:
	rm -rf $(BIN_DIR)/*

# Ejecutar solo si ya está compilado
run: $(CLASSES)
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)
