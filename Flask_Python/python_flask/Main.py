from flask import Flask, render_template
import Servico
app= Flask(__name__)
@app.route('/')
def home():
    return render_template('home.html')
 

@app.route('/config/env')
def env_list():
   return Servico.env_list()

@app.route("/env/<variable>/<content>")
def create_env_var(variable, content):
 return Servico.create_var_linux(variable,content)


@app.route("/list/running_software")
def list_running_software():
    return Servico.list_running_software()



app.run(host='localhost',port=8080)

