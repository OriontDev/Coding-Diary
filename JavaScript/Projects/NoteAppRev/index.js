const notesContainer = document.getElementById('notes-container');
const addNoteBtn = document.getElementById('add-note');

addNoteBtn.addEventListener('click', () => {
  const note = document.createElement('div');
  note.className = 'note';

  const titleInput = document.createElement('input');
  titleInput.type = 'text';
  titleInput.placeholder = 'Title';
  titleInput.className = 'title';

  const bodyTextarea = document.createElement('textarea');
  bodyTextarea.placeholder = 'Write your note here...';
  bodyTextarea.className = 'body';

  const removeButton = document.createElement('button');
  removeButton.className = 'removeButton';
  removeButton.textContent = 'X';

  removeButton.addEventListener('click', () => {
    note.remove();
  });

  note.appendChild(titleInput);
  note.appendChild(bodyTextarea);
  note.appendChild(removeButton);

  notesContainer.appendChild(note);
});
