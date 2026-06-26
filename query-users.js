const Database = require('better-sqlite3');
const path = require('path');

const dataDir = path.join(__dirname, 'Study-Agent-Pro/data');
const dbPath = path.join(dataDir, 'scholar.db');
console.log('SQLite DB path:', dbPath);

const db = new Database(dbPath);
const users = db.prepare('SELECT * FROM users').all();
console.log('SQLite Users:', JSON.stringify(users, null, 2));

db.close();
