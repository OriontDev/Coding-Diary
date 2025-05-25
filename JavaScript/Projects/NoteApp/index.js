function createNote(title, body) {
    const container = document.getElementById('notes-container');

    const noteDiv = document.createElement('div');

    noteDiv.className = 'noteDiv';

    const h1 = document.createElement('h1');
    h1.textContent = title;

    const p = document.createElement('p');
    p.textContent = body;

    noteDiv.appendChild(h1);
    noteDiv.appendChild(p);
    container.appendChild(noteDiv);

    Array.from(container.children).forEach((note, index) => {
        if (index % 2 === 0){
            note.style.backgroundColor = 'tomato';
            note.style.border = 'solid 2px rgb(139, 18, 18)';
        }else{
            note.style.backgroundColor = 'light blue';
            note.style.border = 'solid 2px rgb(26, 40, 145)';
        }
    });
}