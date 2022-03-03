import os

from click import echo
 
def env_list():
    return os.popen('env').read()

def create_var_linux(variable,content):
        var= variable + '=' + content
        os.popen('export' + var)
        return os.getenv( 'var')

def list_running_software():
    return os.popen('ps aux').read()