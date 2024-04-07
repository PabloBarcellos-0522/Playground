import logging

# formatos que eu quero no log (format=)
log_format = "\n\n         %(name)s %(levelname)s %(asctime)s --- %(message)s \n"
literal_format = "%(name)s %(levelname)s %(asctime)s --- %(message)s"
# 


#loggings raiz
logging.basicConfig(filename="app.log", level= logging.DEBUG, format= log_format, datefmt= " %d/%m/%Y %H:%M %p") # filemode= "w"   
logging.basicConfig(filename="app.log", level= logging.DEBUG, format= literal_format, datefmt= " %Hh %Mm %p")
#

# tipos de mensagens no log
logging.debug('teste') #quando não tem getLogger, ou ele é nada então o nome padrao será: root
log = logging.getLogger('Inicio normal')

log.info("Olá!")
log.debug('teste')
log.critical('erro critico!!')
log.error('error')
log.warning('iniciando programa...')
# 


# caso eu queira resetar o logging raiz para reescreve-lo:
def reset_log():     
    for handler in logging.root.handlers[:]:        
        logging.root.removeHandler(handler)
reset_log() 
# 


# verificar o nivel do logger
log.level
# 




 


