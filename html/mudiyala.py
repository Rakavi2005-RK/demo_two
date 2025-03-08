from flask import Flask, render_template

app =Flask(__name__)

# Define a route to serve an HTML page with the button
@app.route('/')
def matdes():
    return render_template('matdes.html')

# Define a route to execute Python code when the button is clicked
@app.route('/execute_python', methods=['POST'])
def execute_python():
    # Add your Python code here
    result = "Python code executed!"
    return result

if __name__ == '_main_':
    app.run(debug=True)